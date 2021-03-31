package assignment1;


import java.util.*;
class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	int count=1;
    String u=user;
    String p=pass;
    if(userId.equals(u) && password.equals(pass)) {
    	return "Welcome Ajay";
    }else {
    	System.out.println("You have entered wrong credentials ,please enter the right credentials");
    	while(count<3) {
    		Scanner s=new Scanner(System.in);
    		System.out.println("Enter userid:");
    		String s1=s.nextLine();
    		System.out.println("enter password");
    		String s2=s.nextLine();
    		 if(userId.equals(s1)&& password.equals(s2) ) {
    		    	return "Welcome Ajay";
    		    }else {
    		    	count++;
    		    	System.out.println("You have entered wrong credentials ,please enter the right credentials");	
    		    }
    	}
     
    	
    }
   return "Contact Admin";
    	
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter userid:");
	String user=s.nextLine();
	System.out.println("enter password");
	String pass=s.nextLine();
	Login obj= new Login();
	System.out.println(obj.loginUser(user, pass));

	
	}
}
