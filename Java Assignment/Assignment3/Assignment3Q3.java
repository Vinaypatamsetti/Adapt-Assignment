package assign3;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Assignment3Q3{
	  public static List traverseReverse(ArrayList aList){
		  List al =new ArrayList();
		  ListIterator <String> itr= aList.listIterator(aList.size()); 
		  while(itr.hasPrevious())  
        {  
            String str=itr.previous();  
             al.add(str);
        }  
		  return al;
	  }
	  
  public static void main(String[] args) {
      ArrayList<String> aList= new ArrayList<>();
      aList.add("Vinay");
      aList.add("Rahul");
      aList.add("Mohan");
      
     System.out.println(traverseReverse( aList));
      
  
}
}