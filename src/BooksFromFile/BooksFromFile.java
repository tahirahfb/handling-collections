package BooksFromFile;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BooksFromFile {

    public static List<Book> readBooks(String file){

        List<Book> books = new ArrayList<>();
        try {
        Files.lines(Paths.get("src/BooksFromFile/BookList.txt"))
        .map(row -> row.split(", "))
        .filter(parts -> parts.length >= 4)
        .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
        .forEach(book -> books.add(book));
        books.forEach(System.out::println);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
    public static void main(String[] args){
        readBooks("src/BooksFromFile/BookList.txt");
    }
}
