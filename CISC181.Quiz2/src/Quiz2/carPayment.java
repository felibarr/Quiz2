package Quiz2;

public class carPayment {

	private double carCost;
	private double downPayment;
	private int loanDuration;
	private double loanInterest;
	
	public carPayment(double carCost, double downPayment, int loanDuration, double loanInterest) {
		super();
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.loanDuration = loanDuration;
		this.loanInterest = loanInterest;
	}

	public double getCarCost() {
		return carCost;
	}

	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public double getLoanInterest() {
		return loanInterest;
	}

	public void setLoanInterest(double loanInterest) {
		this.loanInterest = loanInterest;
	}
	
	public double monthlyPayment() {
		double top = ((double)loanInterest/12) * carCost;
		double bottom = 1 - Math.pow((1 + (double)(loanInterest/12)), -1*loanDuration);
		
		return top/bottom;
	}
	
	public double interestPaid() {
		
		return (double)(monthlyPayment()*loanDuration)-carCost;
	}
	
	
}
