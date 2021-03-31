package assignment2;

import java.util.*;


class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return incentive+salary;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        
        return overtime+salary;
    }
}
public class Assignment2Q2 {
	
	static int salary = 10000;
	    public int getSalary(int salary){
	    	return salary;
	    	
	    }
	    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
	    	 int totalSalary=0;
	    	 for(int t : employeeSalaries ) {
	    		 totalSalary+=t;
	    	 }
	    	return totalSalary;
	    }

	public static void main(String[] args) {
	   
		Assignment2Q2 l=new Labour();
		Assignment2Q2 m=new Manager();
		Assignment2Q2 obj=new Assignment2Q2 ();
		ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
		employeeSalaries.add(l.getSalary(salary));
		employeeSalaries.add(m.getSalary(salary));
		//System.out.println(employeeSalaries);
		System.out.println(obj.totalEmployeesSalary(employeeSalaries));
		
		
  
	}

}
