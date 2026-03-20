package in.ashokit.JdbcApp.runner;


import in.ashokit.JdbcApp.EmpRepo.EmpDao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MyRunner implements ApplicationRunner {

    EmpDao empDao;

    public MyRunner(EmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


    }
}
