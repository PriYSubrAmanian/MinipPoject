package MiniProject;

import java.util.Scanner;

public class BankOperation extends Bank {
   	
	
   public BankOperation(String name, String address, int accountno) {
		super(name, address, accountno);
		// TODO Auto-generated constructor stub
	}
protected String loanname;
   protected int loanno;
    protected double interest;
   protected double loanamount;
     protected int choice;
     {
    	 
     }
	public BankOperation(String name, String address, int accountno, String loanname, int loanno,
			double interest, double loanamount, int choice) {
		super(name, address, accountno);
		this.loanname = loanname;
		this.loanno = loanno;
		this.interest = interest;
		this.loanamount = loanamount;
		this.choice = choice;
		
	}
	public String getLoanname() {
		return loanname;
	}
	public void setLoanname(String loanname) {
		this.loanname = loanname;
	}
	public int getLoanno() {
		return loanno;
	}
	public void setLoanno(int loanno) {
		this.loanno = loanno;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	
	}
	@Override
	public String toString() {
		return "BankOperation [name=" + name + ", address=" + address + ", accountno=" + accountno + "]";
	}
	
}

