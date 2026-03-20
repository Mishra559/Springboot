package in.ashokit.config;


import in.ashokit.Books.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@ComponentScan(value = "in.ashokit")
public class BookConfig {

    @Bean
    public List<Book> getBooks() {
        return List.of(
                new Book(101,"Charles"),
                new Book(102,"Darwin"),
                new Book(103,"Biology")
        );
    }
}
