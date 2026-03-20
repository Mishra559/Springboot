package in.ashokit.app.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class UserService {
    public UserService(){
        System.out.println("UserService::Constructor");
    }

    public void m1(){
        System.out.println("m1()::UserService");
    }
}
