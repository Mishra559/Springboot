package in.ashokit.app.runner;

import in.ashokit.app.entity.Address;
import in.ashokit.app.entity.User;
import in.ashokit.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) throws Exception {
        saveUser();
    }
    private void saveUser() {
        Address address = new Address(147,"NH12","Hyderabad");
        User user = new User(101,"Anshul",address);
        userRepository.save(user);
    }
}
