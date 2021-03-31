package assignment4;

interface calc{
	double math(int a,int b);
}

public class Assignment4Q1 {
    
    public double addition(int num1,int num2){ 
    	calc a= (int i,int j) -> i+j; 
    	return a.math(num1, num2);
    	}

    public double subtraction(int num1,int num2){ 
    	calc s= (int i,int j)-> i-j; 
    	return s.math(num1, num2);
    	}

    public double multiplication(int num1,int num2){ 
    	calc m= (int i,int j)-> i*j; 
    	return m.math(num1, num2);
    	}

    public double division(int num1,int num2){ 
    	calc d= (int i,int j)-> (double)i/j; 
    	return d.math(num1, num2);
    	}
    	
    public static void main(String[] args) {
   
    	Assignment4Q1 obj= new Assignment4Q1();
    	
    	System.out.println("sum : "+obj.addition(13,5));
    	System.out.println("difference : "+obj.subtraction(13,5));
    	System.out.println("product : "+obj.multiplication(13,5));
    	System.out.println("division : "+obj.division(13,5));
    }
}