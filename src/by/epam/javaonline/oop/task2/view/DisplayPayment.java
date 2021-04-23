package by.epam.javaonline.oop.task2.view;

import by.epam.javaonline.oop.task2.bean.Payment;
import by.epam.javaonline.oop.task2.bean.Payment.Product;
import by.epam.javaonline.oop.task2.logic.PaymentLogic;

public class DisplayPayment {
	
	private PaymentLogic paymentLogic;
	
	{
		paymentLogic = new PaymentLogic();
	}

	public void display(Payment payment) {
		for(Product p : payment.getProducts()) {
			System.out.println(p.toString());
		}
		paymentLogic.paymentCost(payment);
		System.out.println(paymentLogic.toString());
	}

	

	
	
}
