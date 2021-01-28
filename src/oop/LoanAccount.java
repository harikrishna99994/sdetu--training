package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		System.out.println("Increased rate");
	}
    
	public void setTerm(int term) {
		System.out.println("Setting the tem for "+ term + " years.");
	}
	
	public void setAmountSchedule() {
		System.out.println("Amount Schedule");
	}
	
}
