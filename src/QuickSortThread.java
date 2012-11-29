
public class QuickSortThread <T extends Comparable<T>> extends Thread {
	T[] arr ;
	int low, high;
	
	public QuickSortThread(T[] inArr, int low, int high){
		arr = (T[]) inArr;
		this.low = low;
		this.high = high;
			
	}
	
	public void run(){
		Quicksort.quickSort(arr, low, high);
	}
}
