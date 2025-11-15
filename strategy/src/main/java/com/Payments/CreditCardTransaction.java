package com.Payments;

public class CreditCardTransaction extends PaymentsAPI {
  @Override
  public void pay(double amount) {
    System.out.println("Amount transfer using CreditCardTransaction");
  }
}
