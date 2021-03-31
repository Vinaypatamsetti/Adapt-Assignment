package assignment1;
import java.util.Scanner; 


public class Q1 {

	public static void main (String[] args)
	{
	 Scanner s =new Scanner(System.in) ;
	   int num=s.nextInt();
	   ArmstrongOrNot obj= new  ArmstrongOrNot();
		
	   System.out.println(obj.armstrongCheck( num));
	  
	 
	 

	}

}

class ArmstrongOrNot{
	  public boolean armstrongCheck(int num) {
		int a,sum=0;
		int temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		
		if(temp==sum) {
			return true;
		}else {
			return false;
		}
		 
	  }
		
	 
	  }