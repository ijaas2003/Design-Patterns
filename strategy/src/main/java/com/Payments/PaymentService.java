package com.Payments;

public class PaymentService {
  private PaymentsAPI paymentsAPI;

  public PaymentService(PaymentsAPI paymentsAPI) {
    this.paymentsAPI = paymentsAPI;
  }

  public void pay(double amount) {
    paymentsAPI.pay(amount);
  }
}
