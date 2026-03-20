package in.ashokit.app.runner;


import in.ashokit.app.entity.Customer;
import in.ashokit.app.entity.Order;
import in.ashokit.app.entity.OrderStatus;
import in.ashokit.app.repository.CustomerRepository;
import in.ashokit.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Component
public class MyRunner implements ApplicationRunner {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       // saveCustomer();

        saveOrder();

    }

    private void saveOrder() {
        Order order = new Order();
        order.setId(1010111L);
        order.setDate(LocalDate.of(2026,5,2));
        order.setStatus(OrderStatus.COMPLETED);
        order.setCustomer(customerRepository.findById(101).get());
        repo.save(order);
    }

    private void saveCustomer() {
        Customer customer = new Customer();
        customer.setId(104);
        customer.setName("Lokesh");
        List<Order> orders = List.of(new Order(101101L,LocalDate.of(2026,1,2),OrderStatus.NEW,customer),
                new Order(101102L,LocalDate.of(2026,1,3),OrderStatus.NEW,customer),
                new Order(101103L,LocalDate.of(2025,1,2),OrderStatus.COMPLETED,customer));

        customer.setOrders(orders);

        customerRepository.save(customer);

    }

}
