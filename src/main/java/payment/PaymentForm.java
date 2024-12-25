package payment;

public class PaymentForm {
    public static void main(String[] args) {

        processPayment("John Doe" , 49.99);
    }
    private static void processPayment(String payee,double amount){
        System.out.println("Initiating payment of $" + amount + "to " + payee + ".....");
        System.out.println("Payment successful");
    }
}
