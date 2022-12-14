package MiniProject;

public class Bank {
   protected String name;
   protected String address;
   protected  int accountno;
  // protected static int accountnogen=10001;
   public void bank()
   {
	  // accountno=accountnogen++;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public  int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
public Bank(String name, String address, int accountno) {
	super();
	this.name = name;
	this.address = address;
	this.accountno = accountno;

}

   
}
