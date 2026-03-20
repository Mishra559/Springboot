package in.ashokit.App.bean;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Lazy
@Scope("prototype")
public class TaskPerform {

    public TaskPerform() {
        System.out.println("TaskPerform object created");
    }



    public void perform() {

        System.out.println("Perform Method Started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Perform Method Ended");
    }
}
