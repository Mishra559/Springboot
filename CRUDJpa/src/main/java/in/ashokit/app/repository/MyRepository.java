package in.ashokit.app.repository;

import in.ashokit.app.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyRepository extends CrudRepository<Employee, Integer> {
}
