package in.ashokit.main;

import in.ashokit.config.AppConfiguration;
import in.ashokit.service.InfoComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.registerShutdownHook();
        InfoComponent infoComponent = (InfoComponent) context.getBean("infoComponent");


    }
}
