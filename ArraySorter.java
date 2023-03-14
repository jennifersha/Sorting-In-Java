public abstract class ArraySorter {
	protected double counter=0;
	protected double length;
	protected String name;

 public abstract int[] sort(int[] a, boolean verbose);
 double ratio=counter/length;
 
 public String getStatistics() {
	String s=name+" – Array length "+"length "+length +" , comparisons "+counter+" , ratio  " +counter/length;
	return s;
}
 public static void printLength(String [] a) {
	 if(a==null) {
		 System.out.println("0");
	 }
	 else {
		 int arraylength=a.length;
		 System.out.println(arraylength);
	 }
 }
 protected int[] copyArray(int[] a){// this method copy the Array in the new Array
		int [] arr=new int[a.length];
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
		}
		return arr;
	}

 protected String printArray(int[] a) {// this method print steps sort array
		if(a.length==0) {
			return "{}";
		}
		String str = "{";
		for (int i = 0; i < a.length - 1; i++)
			str += a[i] + ", ";
			str+=a[a.length - 1] + "}";
		return str;
	}

}