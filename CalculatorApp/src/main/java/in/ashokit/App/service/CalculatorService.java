package in.ashokit.App.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }
}
