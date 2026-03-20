package in.ashokit.app.runner;

import in.ashokit.app.entity.Employee;
import in.ashokit.app.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private MyRepository repository;

    public void run (ApplicationArguments args) throws Exception {

        List<Employee> employees = List.of(
                new Employee(101, "Anshul", 55000.0, "IT"),
                new Employee(102, "Rahul", 45000.0, "HR"),
                new Employee(103, "Sneha", 60000.0, "Finance"),
                new Employee(104, "Amit", 70000.0, "IT")
        );

//        repository.save(new Employee(2003,"karan",1200.0,"IT"));
//        System.out.println("Added successfully");

//        repository.delete(new Employee(2001,"karan",1200.0,"IT"));
//        System.out.println("Deleted successfully");

//        repository.deleteById(104);
//        System.out.println("deleted by id");

//        repository.save(new Employee(501,"nigga",1200.0,"It"));

//        repository.findAll().forEach(System.out::println);

//        Optional<Employee> employee = repository.findById(501);
//        employee.ifPresent(System.out::println);

//        repository.deleteById(501);
//        System.out.println("deleted");

//        repository.deleteAll();


        repository.saveAll(employees);

        List<Employee> employees2 =(List<Employee>) repository.findAll();
        employees2.forEach(System.out::println);







    }

}
