package in.ashokit.app.repository;

import in.ashokit.app.entity.LoginCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, String> {
}
