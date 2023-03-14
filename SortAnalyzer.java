public class SortAnalyzer extends Object{

	private ArraySorter[]sorters;

	public SortAnalyzer() {

		sorters=new ArraySorter[3];

		sorters[0]=new BubbleSorter();

		sorters[1]=new InsertionSorter();

		sorters[2]=new MergeSorter();

	}



	public void analyze(int numOfArrays, int maxSize) {

		while(numOfArrays>0) {

			if(maxSize<10) {

				maxSize=10;

			}

			int []array=new int[maxSize];

			for(int i=0;i<maxSize;i++) {

				array[i]=(int)(Math.random()*100);

			}

			sorters[0].sort(array, false);

			sorters[0].getStatistics();

			sorters[1].sort(array, false);

			sorters[1].getStatistics();

			sorters[2].sort(array, false);

			sorters[2].getStatistics();

			numOfArrays--;

		}

	}


}

