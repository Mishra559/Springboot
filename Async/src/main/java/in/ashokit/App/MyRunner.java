package in.ashokit.App;

import in.ashokit.App.bean.TaskPerform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    TaskPerform taskPerform;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Main thread");
        taskPerform.perform();
        System.out.println("Main thread Ended");
    }
}
