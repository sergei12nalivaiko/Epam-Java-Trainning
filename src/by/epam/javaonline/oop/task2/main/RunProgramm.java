package by.epam.javaonline.oop.task2.main;

import java.math.BigDecimal;

import by.epam.javaonline.oop.task2.bean.Payment;
import by.epam.javaonline.oop.task2.view.DisplayPayment;

public class RunProgramm {

	public static void main(String[] args) {
	
		Payment payment = new Payment();
		DisplayPayment displayPayment = new DisplayPayment();		
		payment.addProduct(payment.newProduct("notebook", new BigDecimal(123)));
		payment.addProduct(payment.newProduct("iPad", new BigDecimal(100)));
		payment.addProduct(payment.newProduct("book", new BigDecimal(10)));
		displayPayment.display(payment);
		
		

	}

}
