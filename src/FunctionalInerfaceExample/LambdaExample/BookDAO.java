package FunctionalInerfaceExample.LambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"Physics",200));
        books.add(new Book(103,"Chemistry",185));
        books.add(new Book(102,"Hindi",376));
        books.add(new Book(105,"Science",298));
        books.add(new Book(104,"Moral",125));
        return books;
    }
}
