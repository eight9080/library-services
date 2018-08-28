package ro.dg.bookservice.service;

import org.springframework.stereotype.Service;
import ro.dg.bookservice.domain.Book;

import java.util.List;
import java.util.Map;

@Service
public class BookService {

    public List<Book> findAllBooks() {
        return null;
    }

    public Book findBookById(Long bookId) {
        return null;
    }

    public Book createBook(Book book) {
        return null;
    }

    public void deleteBook(Long bookId) {

    }

    public Book updateBook(Map<String,String> updates, Long bookId) {
        return null;
    }

    public Book updateBook(Book book, Long bookId) {
        return null;
    }
}
