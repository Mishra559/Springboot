package in.ashokit.app.runner;


import in.ashokit.app.entity.Employee;
import in.ashokit.app.entity.MyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {
    @Autowired
    MyRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//      repo.deleteAll();
//
//        System.out.println("Deleted Successfully");
//
//        List<Employee> employees = Arrays.asList(
//                new Employee(121, "Ritu", 61000.0, "HR"),
//                new Employee(122, "Alok", 72000.0, "IT"),
//                new Employee(123, "Manish", 67000.0, "Finance"),
//                new Employee(124, "Swati", 54000.0, "Admin"),
//                new Employee(125, "Naveen", 88000.0, "IT"),
//                new Employee(126, "Isha", 59000.0, "HR"),
//                new Employee(127, "Prakash", 76000.0, "Finance"),
//                new Employee(128, "Divya", 83000.0, "IT"),
//                new Employee(129, "Gopal", 52000.0, "Admin"),
//                new Employee(130, "Tanvi", 69000.0, "HR"),
//                new Employee(131, "Rohini", 91000.0, "IT"),
//                new Employee(132, "Ashok", 64000.0, "Finance"),
//                new Employee(133, "Mehul", 57000.0, "Admin"),
//                new Employee(134, "Kajal", 78000.0, "IT"),
//                new Employee(135, "Siddharth", 86000.0, "Finance"),
//                new Employee(136, "Payal", 60000.0, "HR"),
//                new Employee(137, "Varun", 74000.0, "IT"),
//                new Employee(138, "Neelam", 66000.0, "Admin"),
//                new Employee(139, "Harsh", 82000.0, "Finance"),
//                new Employee(140, "Ayesha", 70000.0, "HR")
//        );
//
//        repo.saveAll(employees);
//        System.out.println("Saved Successfully");

//        Sort sort = Sort.by(Sort.Direction.DESC, "sal");
//        List<Employee> empList = (List) repo.findAll(sort);
//        empList.forEach(System.out::println);

        Pageable p = PageRequest.of(0, 10, Sort.by("sal").descending());

        Page<Employee> page = repo.findAll(p);
        page.getContent().forEach(System.out::println);



    }

}
