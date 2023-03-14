public class InsertionSorter extends ArraySorter {
	 public int[] sort(int[] a, boolean verbose) {
		 this.name = "InsertionSort";
		 this. counter=0;
	  int n = a.length; 
	  length=a.length;
	  if (a.length == 0) {
			return new int[0];
		}
		boolean thisCounted = false;
		int[] arr = super.copyArray(a);
      for (int j = 1; j < n; j++) {  
          int key = a[j];  
          int i = j-1;  
          thisCounted=true;
          counter++;
          while ( (i > -1) && ( a [i] > key ) ) { 
        	  if (thisCounted == false)
        	  counter++;
              a [i+1] = a [i];  
              i--;  
              thisCounted=false;
          }  
          if (i >= 0 && thisCounted == false)
				counter++;
			arr[i + 1] = key;
			if(verbose)
				System.out.println(super.printArray(arr));// print steps sort array
		}
		return arr;
	 }}

