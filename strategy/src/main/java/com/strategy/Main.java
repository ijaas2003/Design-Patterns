package com.strategy;

import com.Payments.DebitTransaction;
import com.Payments.PaymentService;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    PaymentService service = new PaymentService(new DebitTransaction());
    service.pay(1000.0);
  }
}
