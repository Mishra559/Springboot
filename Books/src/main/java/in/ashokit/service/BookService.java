package in.ashokit.service;


import in.ashokit.BookDao.BDao;
import in.ashokit.Books.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {


    @Autowired
    BDao bd;

    public List<Book> fetchAllBooks() {
        return bd.getBookList();
    }

    public void fetchBookById(int bookId) {
        bd.getBookById(bookId).ifPresent(System.out::println);
    }

}
