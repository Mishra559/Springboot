package in.ashokit.loggingApp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {

    MsgRest msgRest;

    public Runner(MsgRest msgRest) {
        this.msgRest = msgRest;
    }

    public void run(ApplicationArguments args) throws Exception {

        System.out.println(msgRest.getMsg());

    }
}
