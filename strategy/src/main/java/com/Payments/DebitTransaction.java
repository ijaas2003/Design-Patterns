package com.Payments;

public class DebitTransaction extends PaymentsAPI {
  @Override
  public void pay(double amount) {
    System.out.println("Amount debit card transttions");
  }
}
