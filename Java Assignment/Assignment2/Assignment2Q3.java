package assignment2;
import java.util.*;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits -creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return  totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {

	  public int totalCashInBank(ArrayList<Integer> cash){
		  int totalCash=0;
		  for(int c: cash) {
			 totalCash+=c;
		  }
		  return totalCash;
	  }
	    public int getCash(){
	    	return 0;
	    }
	public static void main(String[] args) {
		Assignment2Q3 ca= new CurrentAccount();
		Assignment2Q3 sa= new SavingsAccount();
		Assignment2Q3 obj=new Assignment2Q3();
   
		ArrayList<Integer> cash= new ArrayList<Integer>();
		cash.add(ca.getCash());
		cash.add(sa.getCash());
		//System.out.println(cash);
	  System.out.println(obj.totalCashInBank(cash));

	}

}
