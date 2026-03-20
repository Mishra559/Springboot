package in.ashokit.app.runner;

import in.ashokit.app.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmpRepo empRepo;

    public void run(ApplicationArguments args) throws Exception {

        Double bonus = empRepo.getBonus(101);
        System.out.println("bonus is " + bonus);
    }
}
