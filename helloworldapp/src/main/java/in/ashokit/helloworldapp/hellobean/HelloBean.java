package in.ashokit.helloworldapp.hellobean;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public void sayHello(){
        System.out.println("Hello World! Welcome to SpringBoot outside the ide");
    }
}
