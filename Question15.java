//15. Write a program to create a package named p1, and implement
//this package in ex1 class.

import package1.Book;

public class Question15 {
    public static void main(String[] args) {
        Book book = new NewBook();
        book.setName("Lord of the Rings");
        System.out.println("Favorite book, namely: " + book.getName());
    }
}

class NewBook extends Book {
    public void setName(String bookName) {
        this.name = bookName;
    }
}

// To run this do the action below.
// javac -d ./ Question15.java
// java Question15