package in.ashokit.app.repository;

import in.ashokit.app.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
