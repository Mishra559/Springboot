package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

    public OrderService(@Qualifier(value = "upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay() {
        paymentService.pay();
    }

}
