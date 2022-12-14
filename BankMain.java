package MiniProject;
import java.io.IOException;
import java.util.Scanner;

public class BankMain {
	protected static int balance;
	protected static int withdraw;
	protected static int deposit;
   static int  depositamount;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("WELCOME FOR BANKING");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    String name=sc.next();
    System.out.println("Enter the address:");
    String address=sc.next();
    System.out.println("Enter the AccountNo:");
    int accountno=sc.nextInt();
    System.out.println("do u want to deposit");
	String d=sc.next();
   {
if(d.equals("yes"))
{ 	
    System.out.println("Enter the deposit amount:");
    int deposit=sc.nextInt();
      depositamount=balance+deposit;
     System.out.println("The current balance amount is:"+depositamount);}
else {
	System.out.println("Exit");
}
    System.out.println("do u want to Withdraw");
	String w=sc.next();
	{
if(w.equals("yes"))
{
    System.out.println("Enter the withdraw amount:");
    int withdraw=sc.nextInt();
    int currentbalance=(balance+depositamount)-withdraw;
    System.out.println("The current balance amount is:"+currentbalance);}
else {
	System.out.println("Exit");
    }
       String s;
       System.out.println("do u want to continue");
		s=sc.next();
		{
	if(s.equals("yes"))
	{
		 System.out.println("Enter the  amount for loan:");
	       double amount=sc.nextDouble();
       System.out.println("Enter the choice for loan:");
       int choice=sc.nextInt();
	    double interest; 
     	     switch(choice)
	    {
	    case 1:
	    	System.out.println("Housing loan");
	    	System.out.println("The required loan amount is:"+amount);
	    	 interest=7.5;
	    	double n=12.12;
	    	double loanamount=((amount*interest*n)/100);
	    	double totalloanamount=amount-loanamount;
	    	 System.out.println("Interest of getting laon:"+totalloanamount);
	    	break;
	    case 2:
	    	System.out.println("Car loan");
	    	//System.out.println("The required loan amount is:"+amount);
	    	double n1=6.0;
	    	 double interest1=8.12;
	    	 double loanamount1=((amount*interest1*n1)/100);
	    	 double totalloanamount1=amount-loanamount1;
	    	 System.out.println("Interest of getting laon:"+totalloanamount1);
	    	break;
	    case 3:
	    	System.out.println("Education loan");
	    	 double interest2=5.5;  
	    	 double n2=6.12;
	    	double loanamount2=((amount*interest2*n2)/100);
	    	double totalloanamount2=amount-loanamount2;
	    	 System.out.println("Interest of getting laon:"+totalloanamount2);
	    	break;
	    case 4:
	    	System.out.println("Agricultural loan");
	    	double interest3=8.5;
	    	 double n3=15.24;
	    	 double loanamount3= ((amount*interest3*n3)/100);
	    	 double totalloanamount3=amount-loanamount3;
	    	 System.out.println("Interest of getting laon:"+totalloanamount3);
	    	break;
	    case 5:
	    	System.out.println("Bussiness loan");
	    	 double interest4=11.5;
	    	 double n4=5.12;
	    	 double loanamount4=((amount*interest4*n4)/100);
	    	 double totalloanamount4=amount-loanamount4;
	    	 System.out.println("Amount of getting laon:"+totalloanamount4);
	    	break;
	    }	}
	    	else 
	    	{
	   	    	System.out.println("Process terminated");
	            
     	     }
	    } 
		System.out.println("*******************THANK YOU FOR BANKING *********************");
		}}}}