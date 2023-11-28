package mk.finki.ukim.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.wp.lab.model.Author;
import mk.finki.ukim.wp.lab.model.Book;
import mk.finki.ukim.wp.lab.model.BookStore;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Author> authors = new ArrayList<>();
    public static List<Book> books = new ArrayList<>();
    public static List<BookStore> bookStores;

    @PostConstruct
    public void init() {
        authors.add(new Author(01L, "Matt", "Haig", "Matt Haig (born 3 July 1975) is an English author and journalist."));
        authors.add(new Author(02L, "Ellen Marie", "Wiseman", "Born and raised in Three Mile Bay, a tiny hamlet in Northern New York."));
        authors.add(new Author(03L, "Sabahattin", "Ali", "Sabahattin Ali (25 February 1907 – 2 April 1948) was a Turkish novelist, short-story writer, poet, and journalist."));
        authors.add(new Author(04L, "José Mauro", "Vasconcelos", "José Mauro was born in Rio de Janeiro on February 26, 1920."));
        authors.add(new Author(05L, "Oguz", "Atay", "Oğuz Atay (October 12, 1934 – December 13, 1977) was a pioneer of the modern novel in Turkey."));

        BookStore bookstore = new BookStore("Student Library", "Gaza");

        books.add(new Book("ISBN1", "The Midnight Library", "Fantasy", 2020, authors.subList(0, 1), bookstore));
        books.add(new Book("ISBN2", "What She Left Behind", "Novel", 2019, authors.subList(1, 2), bookstore));
        books.add(new Book("ISBN3", "Madonna in a Fur Coat", "Novel", 1943, authors.subList(2, 3), bookstore));
        books.add(new Book("ISBN4", "My Sweet Orange Tree", "Novel", 1968, authors.subList(3, 4), bookstore));
        books.add(new Book("ISBN5", "The Disconnected ", "Novel", 1971, authors.subList(4, 5), bookstore));
    }
}
