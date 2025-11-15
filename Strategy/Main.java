import Service.PaymentService;
import Strategys.CreditPayment;

public class Main {
  public static void main(String[] args) {
    System.out.println("Amount::::");
    double amount = 1999.0;
    PaymentService paymentService = new PaymentService(new CreditPayment());
    paymentService.pay(amount);
  }
}
