package in.ashokit.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class InfoComponent {
    @Value("${app.name:Spring}")
    private String appName;

    @Value("${app.version:1.02}")
    private String appVersion;

    @Value("${app.admins:a,b,c}")
    private String[] appAdmins;

    public void info(){
        System.out.println("App name: " + appName);
        System.out.println("App version: " + appVersion);
        System.out.println("App admins: " + Arrays.toString(appAdmins));
    }


    @PostConstruct
    public void setUp(){
        info();
        System.out.println("Setting up...");
    }

    @PreDestroy
    public void tearDown(){
        System.out.println("Tearing down...");
    }
}
