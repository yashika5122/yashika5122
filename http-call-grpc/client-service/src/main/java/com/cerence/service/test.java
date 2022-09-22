package com.cerence.service;

import org.languagetool.JLanguageTool;
import org.languagetool.language.*;
import org.languagetool.rules.CategoryId;
import org.languagetool.rules.RuleMatch;
import org.languagetool.rules.Rule;
import org.languagetool.tools.Tools;

import javax.lang.model.SourceVersion;
import javax.tools.Tool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {


        JLanguageTool jLanguageTool = new JLanguageTool(new BritishEnglish());
        String content ="strt my car,plese chck";
//    CategoryId categoryId = new CategoryId("CASING");

        Set<CategoryId> categorySet = new LinkedHashSet<>();
  categorySet.add(new CategoryId("CASING"));
        categorySet.add(new CategoryId("TYPOGRAPHY"));
//    categorySet.add(new CategoryId("CREATIVE_WRITING"));
//    categorySet.add(new CategoryId("WIKIPEDIA"));
        Tools.selectRules(jLanguageTool, categorySet,Collections.emptySet(),Collections.emptySet(),Collections.emptySet(),false,false);
//    Tools.selectRules(jLanguageTool, categorySet,Collections.emptySet(),true);
        List<RuleMatch> matches = jLanguageTool.check(content);
        String check = correctTextFromMatches(content,matches);
        System.out.println("correctTextFromMatches :: "+ check );

    }

    public static String correctTextFromMatches(String contents, List<RuleMatch> matches) {
        StringBuilder sb = new StringBuilder(contents);
        List<String> errors = new ArrayList<>();
        for (RuleMatch rm : matches) {
            List<String> replacements = rm.getSuggestedReplacements();
//      System.out.println("replacements ::"+ replacements);
            if (!replacements.isEmpty()) {
                errors.add(sb.substring(rm.getFromPos(), rm.getToPos()));
            }
        }
        int offset = 0;
        int counter = 0;
        for (RuleMatch rm : matches) {
            List<String> replacements = rm.getSuggestedReplacements();
            System.out.println("replacements ::"+ replacements);
            if (!replacements.isEmpty()) {
                //make sure the error hasn't been already corrected:
//        System.out.println("offset :: "+ offset + "FromPos :: "+rm.getFromPos() + "GetPos :: "+rm.getToPos());
                if (rm.getFromPos()-offset >= 0 &&
                        rm.getToPos()-offset >= rm.getFromPos()-offset &&
                        errors.get(counter).equals(sb.substring(rm.getFromPos() - offset, rm.getToPos() - offset))) {
                    sb.replace(rm.getFromPos() - offset, rm.getToPos() - offset, replacements.get(0));
                    offset += rm.getToPos() - rm.getFromPos() - replacements.get(0).length();
//          System.out.println("offset ::"+ offset);
                }
                counter++;
            }
        }
        return sb.toString();
    }



}

