package ec.edu.ups.payment;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest requestPayment);


}
