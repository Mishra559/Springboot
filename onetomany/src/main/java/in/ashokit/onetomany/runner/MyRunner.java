package in.ashokit.onetomany.runner;

import in.ashokit.onetomany.entity.Customers;
import in.ashokit.onetomany.entity.Order;
import in.ashokit.onetomany.entity.OrderStatus;
import in.ashokit.onetomany.repository.CustomerRepository;
import in.ashokit.onetomany.repository.OrdersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    OrdersRepository ordersRepo;

    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //saveCustomer();

        //removeCustomer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer ID");
        int id = scanner.nextInt();
//        Customers c = findCustomerById(id);
//        System.out.println(c.getName());
//        System.out.println(c.getId());
//        c.getOrders().forEach(System.out::println);

        deleteCustomerById(id);
        System.out.println("Customer with ID " + id + " has been deleted");


    }

    private void saveCustomer(){

        List<Order> lstOrders = Arrays.asList(
                new Order(10107L, LocalDate.of(2026,1,3), OrderStatus.DELIVERED),
                new Order(10108L, LocalDate.of(2026,2,14), OrderStatus.PLACED),
                new Order(10109L, LocalDate.of(2026,3,2), OrderStatus.PENDING)
        );
        Customers customers = new Customers();
        customers.setId(103);
        customers.setName("David");
        customers.setOrders(lstOrders);

        customerRepo.save(customers);
    }

    public Customers findCustomerById(int id){
        return customerRepo.findById(id).get();
    }

    private void deleteCustomerById(int id){
        customerRepo.deleteById(id);
    }
}
