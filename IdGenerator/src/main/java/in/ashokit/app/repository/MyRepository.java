package in.ashokit.app.repository;

import in.ashokit.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface MyRepository extends JpaRepository<Student,Integer> {

}
