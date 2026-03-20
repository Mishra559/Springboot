package in.ashokit.helloworldapp.runner;

import in.ashokit.helloworldapp.hellobean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {
    @Autowired
    HelloBean helloBean;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        helloBean.sayHello();

    }
}
