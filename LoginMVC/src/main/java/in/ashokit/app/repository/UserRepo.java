package in.ashokit.app.repository;

import in.ashokit.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);
    User findByUserName(String userName);
}
