package in.ashokit.app.runner;

import in.ashokit.app.entity.Student;
import in.ashokit.app.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    MyRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Entering runner component");
        List<Student> students = Arrays.asList(
                new Student(null, "Anshul", 85.0),
                new Student(null, "Ravi", 72.5),
                new Student(null, "Amit", 91.0),
                new Student(null, "Neha", 66.0)
        );


        repo.saveAll(students);



    }
}
