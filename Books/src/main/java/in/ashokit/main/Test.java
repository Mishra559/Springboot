package in.ashokit.main;

import in.ashokit.config.BookConfig;
import in.ashokit.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.fetchBookById(102);

        System.out.println("===========================================");


        bookService.fetchAllBooks().forEach(System.out::println);
    }
}
