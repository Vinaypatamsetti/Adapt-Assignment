package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Assignment4Q4 {

	public static void main(String[] args) {
	   
	ArrayList<String> list=new ArrayList<String>();
	list.add("Vinay");
	list.add("Vikram");
	list.add("Yogesh");
	list.add("Gopal");
	list.add("Suresh");
	list.add("Mahesh");

 
	System.out.println(list);
	System.out.println("For even values length");
	list.removeIf(x->(((String) x).length()%2)!=0);
	System.out.println(list);
	}
}