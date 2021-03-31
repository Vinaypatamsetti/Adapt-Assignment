
import java.util.List;
import java.util.ArrayList;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	
    	 List<Integer> list =new ArrayList<>();
    	for(int i=min;i<=max;i++) {
    	
    		int sum=0;
    		
    		int temp=i;
    		int num=i;
    		while(num>0) {
    			int a=num%10;
    			num=num/10;
    			sum=sum+(a*a*a);
    		}
    		if(temp==sum) {
    		 
    		list.add(sum);
    		}
    	}
    	int size=list.size();
    	int a[]=new int[size];
    	for(int j=0;j<size;j++) {
    		a[j]=list.get(j);
    		
    	}
    	
    	return a;
    }
}




public class Assignment1Q2 {

	public static void main(String[] args) {
		 int min = 100;
		 int max = 900;
		 ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();
		 int arr []=obj.armstrongNumbersInRange(min,max);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
	}

}
