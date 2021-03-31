package assignment1;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	
    	int  a[]=arr;
    	 int n = arr.length;  
         int temp = 0;  
          for(int i=0; i < n; i++){  
                  for(int j=1; j < (n-i); j++){  
                           if(arr[j-1] > arr[j]){  
                                  //swap elements  
                                  temp = a[j-1];  
                                  a[j-1] = a[j];  
                                  a[j] = temp;  
                          }  
                           
                  }  
                  
    }
          return a;
}
}

public class Assignment1Q8 {

	public static void main(String[] args) {
		
		        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		        
		        BubbleSort obj =new BubbleSort();
		        int[] array=obj.bubbleSort(arr);
		        for(int i=0;i<array.length;i++) {
		        	System.out.print(array[i]+" ");
		        }
		        
		    }
		
	}


