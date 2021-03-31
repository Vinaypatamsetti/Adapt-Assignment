package assignment1;

import java.util.*;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	
    	int t=time;
    	double r=interestRate;
    	double p=principalAmount;
    	double si=(p*t*r)/100;
    	return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	int t=time;
    	double r=interestRate;
    	double p=principalAmount;
    	double ci=p*(Math.pow( 1+r,t))-p;
    	return (ci);
    }
}

public class Assignment1Q3 {

	public static void main(String []args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter principalAmount:");
		double  principalAmount=s.nextDouble();
		
		System.out.println("Enter time:");
		int time=s.nextInt();
		System.out.println("Enter interestRate :");
		double interestRate =s.nextDouble();
		
		SiCi obj=new SiCi();
		System.out.println("simple interest :"+obj.simpleInterest(principalAmount, time, interestRate));
		System.out.println("compound interest :"+obj.compoundInterest(principalAmount, time, interestRate));
	}
}
