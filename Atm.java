package OOPSConcepts;

public class Atm {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	public static void main(String[] args) {
        // Your application logic starts here
        System.out.println("ATM application started.");
	
	}
	
	//default constructor
	public Atm()
	{
		
	}
	
	//getter setter
	
	
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public double getDepositAmount()
	{
		return depositAmount;
	}
	
	public void setDepositAmount(double depositAmount)
	{
		this.depositAmount = depositAmount;
	}
	
	public double getWithdrawAmount()
	{
		return withdrawAmount;
	}
	
	public void setWithdrawAmount(double withdrawAmount)
	{
		this.withdrawAmount = withdrawAmount;
	

	
}
}
