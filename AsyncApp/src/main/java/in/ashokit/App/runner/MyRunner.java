package in.ashokit.App.runner;

import in.ashokit.App.beans.TaskPerformer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;


@Component
public class MyRunner implements ApplicationRunner {

    TaskPerformer taskPerformer;

    public MyRunner(TaskPerformer taskPerformer) {
        this.taskPerformer = taskPerformer;
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("main thread started ");

        System.out.println("current thread - " + Thread.currentThread().getName());
       CompletableFuture<String> cf =  taskPerformer.task();
       cf.thenAccept(System.out::println);
       System.out.println("main thread end ");
    }
}
