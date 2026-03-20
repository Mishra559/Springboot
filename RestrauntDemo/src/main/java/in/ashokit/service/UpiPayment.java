package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class UpiPayment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("paying via upi");
        System.out.println("payment successfull");
    }
}
