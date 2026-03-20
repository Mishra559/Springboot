package in.ashokit.app.runner;

import in.ashokit.app.entity.OrderStatus;
import in.ashokit.app.entity.Orders;
import in.ashokit.app.repository.MyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    MyRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        repo.findByOrderStatus(OrderStatus.NEW).forEach(System.out::println);
//
//        repo.findByOrderDateBetween(LocalDate.of(2025,01,01), LocalDate.now().plusDays(1)).forEach(System.out::println);

        //repo.fetchOrdersByIdAndStatus(1L,OrderStatus.NEW).forEach(System.out::println);


//        repo.fetchOrders().forEach(System.out::println);

       // System.out.println(repo.updateOrderStatus(OrderStatus.NEW,2L));


       Orders odr =  repo.fetchAllByDate(LocalDate.of(2025,01,03));
        System.out.println(odr.toString());
    }
}
