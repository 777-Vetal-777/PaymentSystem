package services;

import common.Payment;
import common.enums.PaymentType;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void pay(Payment payment) {
        //we can create new abstract class, and several classes to extend instead...

        if(PaymentType.CARD.equals(payment.getType())){

        }else if(PaymentType.BITCOIN.equals(payment.getType())){
            System.out.println("Something went wrong");
        }

    }

}
