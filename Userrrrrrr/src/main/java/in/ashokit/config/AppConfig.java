package in.ashokit.config;

import in.ashokit.model.Users;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@ComponentScan(value ="in.ashokit")
public class AppConfig {

    @Bean
    public List<Users> getUsers(){
        return List.of(
                new Users(101,"John","John@gmail.com"),
                new Users(102,"Allen","Allen@gmail"),
                new Users(103,"Katy","Perry@gmail.com")
        );
    }


}
