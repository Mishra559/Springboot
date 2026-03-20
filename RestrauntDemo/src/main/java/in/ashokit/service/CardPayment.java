package in.ashokit.service;


import org.springframework.stereotype.Service;

@Service
public class CardPayment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("paying via card");
        System.out.println("payment successfull");
    }
}
