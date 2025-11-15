package Strategys;

public class CreditPayment extends PaymentAPI {
  @Override
  public void pay(double amount) {
    System.out.println("thIS IS CREDIT CARD");
  }
}
