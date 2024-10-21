package Oops;

public class Encapulation {

private	int AcountNo;
private	String AcHldrNmae;
private	double Amount;

public int getAcountNo() {
	return AcountNo;
}
public String getAcHldrNmae() {
	return AcHldrNmae;
}
public double getAmount() {
	return Amount;
}
public void setAcountNo(int acountNo) {
	AcountNo = acountNo;
}
public void setAcHldrNmae(String acHldrNmae) {
	AcHldrNmae = acHldrNmae;
}
public void setAmount(double amount) {
	Amount = amount;
}
	public static void main(String[] agrs) {
	     Encapulation bv=new Encapulation();
	        bv.setAcHldrNmae("kmts");
	        bv.setAcountNo(202373247);
	        bv.setAmount(3000000);
	       System.out.println("account holder name = "+bv.getAcHldrNmae());
	      
	       System.out.println("Account Number = "+bv.getAcountNo());
	      
	       System.out.println("balance amount = "+bv.getAmount());
	}
}
