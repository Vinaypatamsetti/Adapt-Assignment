package assignment1;
import java.util.*;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	
    	int pay=ctc;
    	double tax=0.0;
    	 if(pay<=180000 ) {
    		
    		 
    	 }
    	 else if(pay>181001 && pay<=300000) {
    		tax=(pay*0.1); 
    	 }else if(pay>= 300001 && pay<=500000) {
    		 tax=pay*0.2;
    	 }else if(pay>= 500001 && pay<=1000000) {
    		 tax=pay*0.3;
    	 }
    
    	
    return tax;	
    }
}


public class Assignment1Q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ctc:");
		int ctc=s.nextInt();
		
		TaxAmount obj= new TaxAmount();
		System.out.println(obj.calculateTaxAmount(ctc));

	}

}
