package in.ashokit.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;


@Configuration
public class MyAppConfig {


    @Autowired
    DataSource dataSource;


    @Bean
    public SimpleJdbcCall simple() {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(dataSource);
        return simpleJdbcCall;
    }

}
