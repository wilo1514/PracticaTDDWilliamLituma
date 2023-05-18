package ec.edu.ups.payment;

public class PaymentProcessor {
    private final PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway){
        this.gateway = gateway;
    }
    public boolean makePayment(double amount){
        PaymentResponse response = gateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == PaymentResponse.PaymentStatus.OK;

    }
}
