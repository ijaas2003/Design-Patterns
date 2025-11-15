package com.Payments;

public class UPITransaction extends PaymentsAPI {
  @Override
  public void pay(double amount) {
    System.out.println("Amount transactions done via UPI");
  }
}
