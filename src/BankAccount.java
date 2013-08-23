
public class BankAccount {

	private int accountNumber;
	private String customerName;
	private double accountBalance;
	private double fee = 4;
	
	
//Overloaded Constructors
public BankAccount(int accountNumber, String name, double balance) {
	this.accountNumber = accountNumber;
	this.customerName = name;
	this.accountBalance = balance;
}

//Default Constructor
public BankAccount() {
	this(0000, "JaneSmith", 0);
}

//Accessor methods
public int getAccountNumber() {
	return accountNumber;
}

public String getCustomerName() {
	return customerName;
}

public double getAccountBalance() {
	return accountBalance;
}

//Mutator methods
public void setAccountNumber(int newAccountNumber) {
	accountNumber = newAccountNumber;
}

public void setCustomerName(String newCustomerName) {
	customerName = newCustomerName;
}

public void setAccountBlance(float newAccountBalance) {
	accountBalance = newAccountBalance;
}

//Method to include monthly fee
public void deductMonthlyFee(double fee) {
	fee = 4.00;
}

//Method to explain account policy 
public static void explainAccountPolicy() {
	System.out.println("A $4 dollar montly service fee will be deducted each month");
}

}
