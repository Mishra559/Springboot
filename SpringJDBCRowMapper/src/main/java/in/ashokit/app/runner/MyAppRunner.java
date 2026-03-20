package in.ashokit.app.runner;

import in.ashokit.app.model.Employee;
import in.ashokit.app.repository.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;


@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmpDao empDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Employee> emp = empDao.getAll();
        emp.forEach(System.out::println);

        System.out.println("==============================================");

        Set<Employee> set = empDao.findAll();
        set.forEach(System.out::println);

    }
}
