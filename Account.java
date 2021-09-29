package atm;
//import java.text.DecimalFormat;
//import java.util.Scanner;

/*public class Account {

	//private String customerUserName;
	private int customerUserName;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###.01");
    
    public int setCustomerUserName(int customerUserName) {
    	this.customerUserName = customerUserName;
    	return customerUserName;
    	}
	
	public int getCustomerUserName() {
		
		return customerUserName;
	}
	
	public int setPinNumber(int PinNumber ) {
		
		this.pinNumber =  PinNumber;
		return PinNumber;
	}
	public int getPinNumber() {
		
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	public double calcCheckingWithdraw(double amount) { 
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
		
	}
	
	
	public double calcSavingWithdraw(double amount) { 
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	public double calcCheckingDeposit(double amount) { 
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	
	public double calcSavingDeposit(double amount) { 
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	public void getBackInput() {
		
		getCheckingBalance();
		
	}
	
	public void getCheckingWithdrawInput() {
		
		System.out.println("Checking Account Balance :  " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account: ");
		
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount)>= 0 ) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
			}else 
				
				System.out.println("Balance Cannot be Nagetive." + "\n");
			
			
				
			}
		
	public void getSavingWithdrawInput() {
			
		System.out.println("Saving Account Balance :  " + moneyFormat.format(savingBalance));
		System.out.println("Amount you to want withdraw from Saving Account: ");
		double amount = input.nextDouble();
			
		if ((savingBalance - amount)>= 0 ) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: "+moneyFormat.format(savingBalance));
				
			}else 
					
				System.out.println("Balance Cannot be Nagetive." + "\n");
					
				
	
		}
	
	public void getSavingDepositInput() {
			
			System.out.println("Saving Account Balance :  " + moneyFormat.format(savingBalance));
			System.out.println("Amount you to want Deposit from Saving Account: ");
			double amount = input.nextDouble();
			
			if ((savingBalance + amount)>= 0 ) {
				calcSavingDeposit(amount);
				System.out.println("New Saving Account Balance: "+moneyFormat.format(savingBalance));
				}
				
				else 
					
					System.out.println("Balance Cannot be Nagetive." + "\n");
					
	
		}
	
	public void getCheckingDepositInput() {
				
				System.out.println("Checking Account Balance :  " + moneyFormat.format(checkingBalance));
				System.out.println("Amount you want to Deposit from checking Account: ");
				double amount = input.nextDouble();
				//System.out.println(amount);
				if ((checkingBalance + amount)>= 0 ) {
					calcCheckingWithdraw(amount);

					System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));

					}else {
						
						System.out.println("Balance Cannot be Nagetive." + "\n");
					}
					
						
					}
	
	
	
	
	
		
	
}*/


import java.text.DecimalFormat;
import java.util.*;

public class Account {
  //variables
  private int customerUserName;
  private int pinNumber;
  private double checkingBalance = 100.00;
  private double savingBalance = 100.00;

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  public int setCustomerUserName(int customerUserName){
    this.customerUserName = customerUserName;
    return customerUserName;
  }

  public int getCustomerUserName(){
    return customerUserName;
  }

  public int setPinNumber(int pinNumber){
    this.pinNumber = pinNumber;
    return pinNumber;
  }

  public int getPinNumber(){
    return pinNumber;
  }
  
  public void getBackInput() {
		
		getCheckingBalance();
		
	}
  

  public double getCheckingBalance(){
    return this.checkingBalance;
  }

  public double getSavingBalance(){
    return savingBalance;
  }

  public double calcCheckingWithdraw(double amount){
    checkingBalance = (checkingBalance - amount);
    return this.checkingBalance;
  }

  public double calcSavingWithdraw(double amount){
    savingBalance = (savingBalance - amount);
    return savingBalance;
  }

  public double calcCheckingDeposit(double amount){
    checkingBalance = (checkingBalance + amount);
    return checkingBalance;
  }

  public double calcSavingDeposit(double amount){
    savingBalance = (savingBalance + amount);
    return savingBalance;
  }

  public void getCheckingWithdrawInput(){
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
    System.out.print("Amount you want to withdraw from Checking Account: ");
    double amount =input.nextDouble();

    if((checkingBalance-amount)>=0){
      calcCheckingWithdraw(amount);
      System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
      }else{
      System.out.println("Balance Cannot be Negative." + "\n");
      }
    }

    public void getSavingWithdrawInput(){
      System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
      System.out.print("Amount you want to withdraw from saving Account: ");
      double amount =input.nextDouble();

      if((savingBalance-amount)>=0){
        calcSavingWithdraw(amount);
        System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
        }else{
        System.out.println("Balance Cannot be Negative." + "\n");
        }
      }

      public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to Deposit from Checking Account: ");
        double amount =input.nextDouble();

        if((checkingBalance+amount)>=0){
          calcCheckingDeposit(amount);
          System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
          }else{
          System.out.println("Balance Cannot be Negative." + "\n");
          }
        }

        public void getSavingDepositInput(){
          System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
          System.out.print("Amount you want to Deposit from saving Account: ");
          double amount =input.nextDouble();

          if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
            }else{
            System.out.println("Balance Cannot be Negative." + "\n");
            }
          }


}
