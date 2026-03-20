package in.ashokit.main;

import in.ashokit.config.AppConfig;
import in.ashokit.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = (UserService) context.getBean("userService");


        userService.fetchById(102);


        System.out.println("================================================");


        userService.fetchAll().forEach(System.out::println);
    }
}
