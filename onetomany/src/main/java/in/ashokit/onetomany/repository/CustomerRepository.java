package in.ashokit.onetomany.repository;

import in.ashokit.onetomany.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Integer> {
}
