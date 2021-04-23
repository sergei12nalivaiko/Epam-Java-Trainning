package by.epam.javaonline.oop.task2.logic;

import java.math.BigDecimal;
import by.epam.javaonline.oop.task2.bean.Payment;
import by.epam.javaonline.oop.task2.bean.Payment.Product;

public class PaymentLogic {

	private BigDecimal totalPrize;
	
	{
		totalPrize = new BigDecimal(0);
	}
	
	public BigDecimal paymentCost(Payment payment) {
		
		for (Product p : payment.getProducts()) {
			totalPrize = totalPrize.add(p.getPrize());
		}
		return totalPrize;
	}

	@Override
	public String toString() {
		return "PaymentLogic [totalPrize=" + totalPrize + "]";
	}
	
}
