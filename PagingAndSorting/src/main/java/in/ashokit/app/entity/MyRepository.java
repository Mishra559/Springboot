package in.ashokit.app.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MyRepository extends PagingAndSortingRepository<Employee, Integer>, CrudRepository<Employee,Integer> {

}
