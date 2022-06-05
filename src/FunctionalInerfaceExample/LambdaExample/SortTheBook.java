package FunctionalInerfaceExample.LambdaExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheBook {

    //    First Approach
    public List<Book> getSortedById() {
        List<Book> bookList = new BookDAO().getBooks();
        Collections.sort(bookList, new IdComparator());
        return bookList;
    }

//  Second Approach override here
    public List<Book> getSortedByName() {
        List<Book> books = new BookDAO().getBooks();
//       Collections.sort(books,new NameComparator());
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return books;
    }

//  Third Approach by Lambda Expression, convert compare() to lambda expression
    public List<Book> getSortedByNameLambda() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books,(o1, o2) -> o2.getName().compareTo(o1.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new SortTheBook().getSortedById());
        System.out.println("-------------------------");
        System.out.println(new SortTheBook().getSortedByName());
        System.out.println("------------Reversed order-------------");
        System.out.println(new SortTheBook().getSortedByNameLambda());
    }
}

//First Approach is to make separate Comparator class
 /*class NameComparator implements Comparator<Book> {

     @Override
     public int compare(Book o1, Book o2) {
         return o1.getName().compareTo(o2.getName());
     }
 }*/

class IdComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getId() == o2.getId()) {
            return 0;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        } else return -1;
    }
}
