package in.ashokit.app.repository;

import in.ashokit.app.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport,String> {
}
