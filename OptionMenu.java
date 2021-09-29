package atm;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,###.01");
    
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
    public void getLogin() throws IOException {
	 int x = 1;
		
		do {
			try {
				data.put(1111, 12345678);
				data.put(2222, 6369);
				
				System.out.println("Welcome to ATM project");
				System.out.println("Enter your user name");
				setCustomerUserName(menuInput.nextInt());
				
				System.out.println("Enter your pin");
				setPinNumber(menuInput.nextInt());
				
			}catch (Exception e) {
				System.out.println("\n"+"please enter valid information"+"\n");
				x=2;
				
		    }
			
			int cn=getCustomerUserName();
	         int pn=getPinNumber();
	         if(data.containsKey(cn) && data.get(cn)==pn){
	             getAccountType();
	         }else
	         System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
		 }while(x==1); 
		    	 
    }	    	 
	public void getAccountType()  {
    	
    	System.out.println("Select the Account you Want to Access: ");
    	System.out.println("type 1 - Checking Account");
    	System.out.println("type 2 - Saving account");
    	System.out.println("type 3 - extit");
    	
    	int selection = menuInput.nextInt();
    	
    	switch(selection) {
    	case 1 : 
    		getChecking();
    		
    		break;
    	case 2: 
    		getSaving();
    		
		break;
    	case 3:
    		System.out.println("Thanks for using halal bank..... Barakallah feek");
    	    break;
		default:
    		System.out.println("\n"+"You have entered invalid choice."+"\n");
    		getAccountType();
    	
    	}
    	
    	
    } 
	
    public void getChecking() {
    	System.out.println("Checking Account: ");
    	System.out.println("Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Funds");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Back");
    	System.out.println("Type 5 - Exit");
    	System.out.println("Choice:");
    	
    	int selection = menuInput.nextInt();
    	
    	switch (selection) {
		case 1: 
			System.out.println("Your Balance: "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2: 
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		
		case 3: 
			getCheckingDepositInput();
			getAccountType();
			break;
			
		
		case 4: 
			getBackInput();
			break;
			
			
		
		case 5: 
		System.out.println("Thanks For Using Our Halal bank .... Barakallah");
		
			break;
		default:
			System.out.println("\n"+"Invalid Key"+"\n");
			getAccountType();
			
		}
    	
    	
    	
    	
    	
    }

	public void getSaving() {
    	System.out.println("Checking Account: ");
    	System.out.println("Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Funds");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Back");
    	System.out.println("Type 5 - Exit");
    	System.out.println("Choice:");
    	
    	int selection = menuInput.nextInt();
    	
    	switch (selection) {
		case 1: 
			System.out.println("Your Balance: "+moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2: 
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		
		case 3: 
			getSavingDepositInput();
			getAccountType();
			break;
			
		
		case 4: 
			getBackInput();
			getAccountType();
			break;
			
			
		
		case 5: 
		System.out.println("Thanks For Using Our Halal bank .... Barakallah");
		
			break;
		default:
			System.out.println("\n"+"Invalid Key"+"\n");
			getAccountType();
			
		}


    }

    
}
