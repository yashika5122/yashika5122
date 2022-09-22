package com.cerence;

import com.proto.textProcessor.Author;
import com.proto.textProcessor.Book;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public static List<Author> getAuthorFromTempDB() {
        return new ArrayList<Author>() {
            {
                add(Author.newBuilder().setAuthorId(1).setBookId(1).setFirstName("yashika").setLastName("chandra").setGender("female").build());
                add(Author.newBuilder().setAuthorId(2).setBookId(2).setFirstName("ramesh").setLastName("kumar").setGender("male").build());
                add(Author.newBuilder().setAuthorId(3).setBookId(3).setFirstName("ram").setLastName("kumar").setGender("male").build());
                add(Author.newBuilder().setAuthorId(4).setBookId(4).setFirstName("sita").setLastName("kumari").setGender("female").build());
            }
        };
    }

    public static List<Book> getBookFromTempDB() {
        return new ArrayList<Book>() {
            {
                add(Book.newBuilder().setAuthorId(1).setBookId(1).setPage(23).setPrice(234).setTitle("hello").build());
                add(Book.newBuilder().setAuthorId(2).setBookId(3).setPage(24).setPrice(235).setTitle("byee").build());
                add(Book.newBuilder().setAuthorId(3).setBookId(3).setPage(25).setPrice(236).setTitle("chalo").build());
                add(Book.newBuilder().setAuthorId(4).setBookId(4).setPage(26).setPrice(237).setTitle("bhago").build());
            }
        };
    }
}
