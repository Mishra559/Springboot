package in.ashokit.onetomany.repository;

import in.ashokit.onetomany.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order,Integer> {
}
