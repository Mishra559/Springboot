package in.ashokit.App.beans;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


@Service
public class TaskPerformer {
    @Async
    public CompletableFuture<String> task() {

        System.out.println("Inside Async method");
        System.out.println("Async method Started");
        System.out.println("name of the current thread " + Thread.currentThread().getName());

        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Async method Ended");
        return CompletableFuture.completedFuture("Async method return object");
    }
}
