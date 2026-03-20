package in.ashokit.App.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    TaskPerform taskPerform;
    public B(TaskPerform taskPerform) {
        this.taskPerform = taskPerform;
    }
}
