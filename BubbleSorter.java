public class BubbleSorter extends ArraySorter{
	 public int[] sort(int[] a, boolean verbose) {
		 this.name = "BubbleSort";
		this.counter=0;
		 int n = a.length; 
		 length=a.length;
		 if (a.length == 0) {
				return new int[0];
			}

			 int []arr=super.copyArray(a); 
	        for (int i = 0; i < n-1; i++) 
	        	
	            for (int j = 0; j < n-1; j++) {
	            	  counter++;  
	            	  
	        if (arr[j] > arr[j+1]) {
	                { 
	                    // swap a[j+1] and a[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	               
	              }
	            if(verbose)
	            System.out.println(super.printArray(arr));
	            }
	 }
			return arr;        
	 }
}
