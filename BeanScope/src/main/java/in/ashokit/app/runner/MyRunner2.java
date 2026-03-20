package in.ashokit.app.runner;

import in.ashokit.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner2 implements ApplicationRunner {
    @Autowired
    UserService userServ;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        userServ.m1();
    }
}
