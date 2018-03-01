package Quiz2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class carPaymentTest {

	public static void main(String[] args) {
	
	carPayment car1 = new carPayment(35000, 0, 60, .1);
	
	if (car1.getCarCost() == 35000) {
		System.out.println("correct!");
	}
	
	System.out.println(car1.monthlyPayment());
	System.out.println(car1.interestPaid());
	
	}
}