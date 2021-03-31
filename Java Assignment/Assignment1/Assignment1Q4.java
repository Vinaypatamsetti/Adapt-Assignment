package assignment1;

import java.util.*;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	
    	double s1=subject1Marks;
    	double s2=subject2Marks;
    	double s3=subject3Marks;
    	
    	if(s1>60 && s2>60 && s3>60) {
    	 return "passed";
    	 
    	}
    	
    	if(s1>60) {
    		if(s2>60 || s3>60) {
    			return "promoted";
    		}
    		
    	}else if(s2>60 && s3>60){
    		return "promoted";
    	}
    	
    	
    	return "failed";  
    }
}

public class Assignment1Q4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("subject1Marks:");
		double  subject1Marks=s.nextDouble();
		
		System.out.println("Enter subject2Marks:");
		double subject2Marks =s.nextDouble();
		System.out.println("Enter subject3Marks :");
		double subject3Marks =s.nextDouble();
		
		ResultDeclaration obj=new ResultDeclaration();
		System.out.println(obj.declareResults(subject1Marks, subject2Marks, subject3Marks));

	}

}
