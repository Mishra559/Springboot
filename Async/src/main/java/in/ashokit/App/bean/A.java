package in.ashokit.App.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    TaskPerform taskPerform;
    public A(TaskPerform taskPerform) {
        this.taskPerform = taskPerform;
    }
}
