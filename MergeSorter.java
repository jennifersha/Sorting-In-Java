public class MergeSorter extends ArraySorter{
	 private boolean verbose;

	public int[] sort(int[] a, boolean verbose) {
		this.name = "MergeSort";
		 this.counter=0;
		 int n = a.length; 
		  length=a.length;
		  if (a.length == 0) {
				return new int[0];
			}
			int []arr=super.copyArray(a);
		  mergeSort(a,0, n-1);
	  
		  return arr;
	}
	private void mergeSort(int[] arr, int first, int last) {
		if (first >= last) {
			return;
		}
		int middle = (first + last) / 2;

		mergeSort(arr, first, middle);// Divides the array
		mergeSort(arr, middle + 1, last);// Divides the array
		merge(arr, first, last);// this method bring together the Dividing arrays

	}
	private void merge(int[] arr, int first,int last) {// this method sort the array by Divided it two parts
		int[] newArray = new int[last -first + 1];// the new array will have the numbers sorted
		int mid = (first + last) / 2;

		int aCounter = first;
		int arrCounter = mid + 1;

		for (int i = 0; i < newArray.length; i++) {

			if (aCounter > mid) {// this situation if arr1Counter still move after mid , for example : the array was sort

				while (arrCounter <= last) {

					newArray[i] = arr[arrCounter];
					i++;
					arrCounter++;

				}

			} else if (arrCounter > last) {// this situation if arr2Counter still move after end

				while (aCounter <= mid) {

					newArray[i] = arr[aCounter];
					i++;
					aCounter++;
				}

			} else if (arr[aCounter] < arr[arrCounter]) {// the first part of array
				counter++;
				newArray[i] = arr[aCounter];// copy to new array
				aCounter++;

			} else {
				counter++;
				newArray[i] = arr[arrCounter];// copy to new array
				arrCounter++;

			}

		}

		for (int i = 0; i < newArray.length; i++) {
			arr[first] = newArray[i];// copy to array arr
			first++;
		}
		if (this.verbose) 
			System.out.println(super.printArray(arr));

	}
    } 

    