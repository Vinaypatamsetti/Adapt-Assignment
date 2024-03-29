package assignment5;
import java.util.*;


 class Trader {
	 private String name;
	    private String city;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public Trader(String name, String city) {
	        this.name = name;
	        this.city = city;
	    }

	    @Override
	    public String toString() {
	        return "Trader [city=" + city + ", name=" + name + "]";
	    }
}
public class Asssignment5Q3 {
	public static ArrayList<String> printUniqueCities (List <Trader> traders) { 
        
	       ArrayList<String> uniqueCities= new ArrayList<>();
	       for(Trader x:traders)
	       {
	           if(uniqueCities.contains(x.getCity()))
	           continue;
	           uniqueCities.add(x.getCity());
	       }
	       return uniqueCities;
	    }

	    public static ArrayList<String> tradersFromPuneSortByName(ArrayList<Trader> traders) {
	        ArrayList<String> fromPune= new ArrayList<>();
	        Collections.sort(traders,(x1,x2)->x1.getName().compareTo(x2.getName()));
	        for(Trader x: traders)
	        {
	            if(x.getCity().equals("PUNE"))
	            fromPune.add(x.getName());
	        }
	        return fromPune;
	    }
	    public static ArrayList<String> allTradersNames(ArrayList<Trader> traders) {
	        Collections.sort(traders,(x1,x2)->x1.getName().compareTo(x2.getName()));
	        ArrayList<String> list= new ArrayList<>();
	        for(Trader x: traders)
	        {
	            list.add(x.getName());
	        }
	        return list;
	    }
	    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
	        ArrayList<Trader> fromIndore= new ArrayList<>();
	        for(Trader x:traders)
	        {
	        if(x.getCity().equals("INDORE"))
	        fromIndore.add(x);
	    }
	        return fromIndore;
	    }
	    public static void main(String[] args) {
	        Trader t1= new Trader("Vinay", "PUNE");
	        Trader t2= new Trader("Mahesh", "INDORE");
	        Trader t3= new Trader("Umesh", "DELHI");
	        Trader t4= new Trader("Virat", "PUNE");
	        Trader t5= new Trader("Iyer", "INDORE");
	        ArrayList<Trader> traders= new ArrayList<>();
	        traders.add(t1);       
	        traders.add(t2);       
	        traders.add(t3);       
	        traders.add(t4);       
	        traders.add(t5);
	        
	        System.out.println(printUniqueCities(traders));
	        System.out.println(tradersFromPuneSortByName(traders));
	        System.out.println(allTradersNames(traders));
	        System.out.println(areAnyTradersFromIndore(traders));

	    }
}