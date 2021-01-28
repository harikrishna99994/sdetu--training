package oop;

public class AccountApp {

	public static void main(String[] args) {

		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmountSchedule();
		la.setTerm(20);
		
		// polymorphism changes where we are pointing
		IRate acct1 = new LoanAccount();
		acct1.increaseRate();
        acct1.setRate();
	}

}
