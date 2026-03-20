package in.ashokit.app.service;


import in.ashokit.app.entity.LoginCredentials;
import in.ashokit.app.repository.LoginCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginCredentialsRepository repository;

    public LoginCredentials fetchCredentials(String username, String password) {
        LoginCredentials loginCredentials = repository.findById(username).orElse(null);
        if (loginCredentials != null) {
            if (loginCredentials.getPassword().equals(password) && (loginCredentials.getActive() == 1)) {
                return loginCredentials;
            }
        }
        return null;
    }
}
