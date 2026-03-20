package in.ashokit.BookDao;


import in.ashokit.Books.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BDao {


    @Autowired
    List<Book> bookList;


    public List<Book> getBookList() {
        return bookList;
    }

    public Optional<Book> getBookById(int bookId) {
        return bookList.stream().filter(book -> book.getBookId() == bookId).findFirst();
    }
}
