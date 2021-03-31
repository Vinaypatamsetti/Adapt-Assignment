package assign3;
	import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

	class Person{
	    private String name;
	    private int height;
	    private double weight;
	    Person(String name, int height, double weight)
	    {
	        this.name=name;
	        this.height=height;
	        this.weight=weight;
	    }

	    public String n() {
	        return name;
	    }

	    public int h() {
	        return height;
	    }

	    public double w() {
	        return weight;
	    }

	}

	class sorting implements Comparator<Person>{
	    
	    @Override
	    public int compare(Person p1, Person p2)
	    {
	        if(p1.w()==p2.w())
	        {
	            if(p1.h()>p2.h())
	                return 1;
	            else 
	                return -1;
	        }
	        else
	        {
	            if(p1.w()>p2.w())
	            return 1;
	            else
	            return -1;
	        }
	    
	    }
	}

	public class Assignment3Q1 {
	    public static void main(String[] args) {

	        Set<Person> set=new TreeSet<>(new sorting());       
	        set.add(new Person("Vinay",6,75));
	        set.add(new Person("Mohan",7,55));
	        set.add(new Person("Rahul",6,55));
	       
	        for(Person p:set)
	        System.out.println(p.n());
	    }


}
