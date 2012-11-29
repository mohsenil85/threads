
public class Quicksort {
	public static <T extends Comparable<T>> void sort(T[] table){
		
		int pivot1 = partition(table, 0, table.length-1);
		int pivot2 = partition(table, 0, pivot1 -1);
		int pivot3 = partition(table, pivot1 +1, table.length-1);
		
		
		QuickSortThread<T>  qs1 = new QuickSortThread<T>(table, 0, (pivot2 -1));
		QuickSortThread<T>  qs2 = new QuickSortThread<T>(table, (pivot2 +1), (pivot1 -1));
		QuickSortThread<T>  qs3 = new QuickSortThread<T>(table, (pivot1 +1), pivot3 -1);
		QuickSortThread<T>  qs4 = new QuickSortThread<T>(table, pivot3 +1,table.length-1);
		
		qs1.start();
		qs2.start();
		qs3.start();
		qs4.start();
		
		try{
			qs1.join();
			qs2.join();
			qs3.join();
			qs4.join();
		}catch (InterruptedException e){}
	}
	public static <T extends Comparable<T>> void quickSort(T[] table, int first, int last){
		if (first < last){
			int pivIndex = partition(table, first, last);
			quickSort (table, first, pivIndex - 1);
			quickSort (table, pivIndex + 1, last);
		}
	}
	public static <T extends Comparable<T>> int partition(T[]table, int first, int last){
		T pivot = table[first];
		int up = first;
		int down = last;
		do {
			while ((up< last) && (pivot.compareTo(table[up]) >= 0)){
				up++;
			}
			while (pivot.compareTo(table[down]) < 0){
				down--;
			}
			if (up < down) {
				swap(table, up, down);
				
			}
		} while (up < down);
		swap(table, first, down);
		return down;
		
	}
	
	private static <T extends Comparable<T>> void swap(T[] table, int a, int b){
		T temp = table[a];
		table[a] = table[b];
		table[b] = temp;
		
		
	}

}
