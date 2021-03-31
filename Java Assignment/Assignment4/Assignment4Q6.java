package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("rahul");
		list.add("Vinay");
		list.add("umesh");
		list.add("manish");
		
		
	System.out.println(new Assignment4Q6().convertToUpperCase(list));
	
	}
	

    public List<String> convertToUpperCase(List<String> list) {
    	UnaryOperator<String> uo = item -> item.toUpperCase();
    	list.forEach(n -> Collections.replaceAll(list,n,uo.apply(n)));
    	
    	return list;
    }  
}