package com.cerence.controller;

import com.cerence.service.*;
import com.google.protobuf.Descriptors;
//import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
//@AllArgsConstructor
public class TextProcessorController {
    @Autowired
    BookAuthorClientService bookAuthorClientService;

    @GetMapping("/author")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(@RequestParam("authorId") String authorId) throws IOException {
        return bookAuthorClientService.getAuthor(Integer.parseInt(authorId));
    }

    @Autowired
    BingClientService bingService;

    @RequestMapping("/bingspellchecker")
    public Map<String, String> bingSpellCheckValidator(@RequestParam("inputString") String inputString, @RequestParam("inputLanguage") String inputLanguage) throws Exception {
        return bingService.bingspellservice(inputString, inputLanguage);
    }

    @Autowired
    EmojiClientService emojiClientService;
    @RequestMapping("/emojiCheck")
    public Map<String, String> EmojiCheckValidator(@RequestParam("inputString") String inputString, @RequestParam("inputLanguage") String inputLanguage) throws Exception {
        return emojiClientService.emojiService(inputString, inputLanguage);
    }

    @Autowired
    AcronymsClientService acronymsClientService;
    @RequestMapping("/acronymCheck")
    public Map<String, String> acronymCheckValidator(@RequestParam("inputString") String inputString, @RequestParam("inputLanguage") String inputLanguage) throws IOException{
        return acronymsClientService.acronymService(inputString,inputLanguage);
    }

    @Autowired
    JlanguageSpellCheckerService jlanguagespellService;
    @RequestMapping("/jlanguagespellchecker")
    public Map<String, String> spellCheckValidator(@RequestParam("inputString") String inputString) throws IOException{
        return jlanguagespellService.jlanguageSpellService(inputString);
    }
}
