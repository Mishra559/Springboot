package in.ashokit.app.repository;

import in.ashokit.app.entity.OrderStatus;
import in.ashokit.app.entity.Orders;
import jakarta.transaction.Transactional;
import org.hibernate.query.Order;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MyRepository extends JpaRepository<Orders, Long> {


//   @Query(value = "SELECT o FROM Orders o WHERE o.OrderStatus = ?1")
//    List<Orders> findByStatus(OrderStatus status);


   @Query(value= "SELECT * FROM ORDERS WHERE ID = ?1 or ORDER_STATUS = ?2",nativeQuery = true)
        List<Orders> fetchOrdersByIdAndStatus(Long id, OrderStatus status);



   @Query(value = "SELECT o FROM Orders o")
   List<Orders> fetchOrders();


   @Query(value = "UPDATE Orders o SET o.orderStatus = :status WHERE o.id = :id")
   @Modifying
   @Transactional
   int updateOrderStatus(@Param("status") OrderStatus status,@Param("id") Long id);

    List<Orders> findByOrderStatus(OrderStatus orderStatus);

    List<Orders> findByOrderDateBetween(LocalDate start, LocalDate end);


    Orders fetchAllByDate(LocalDate date);

}
