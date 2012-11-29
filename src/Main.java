
public class Main {
	public static void main(String [] args){
		
		Integer[] testArr = ArrUtils.creatArr(10);
		
		
//		QuickSortThread qs1 = new QuickSortThread();
//		QuickSortThread qs2 = new QuickSortThread();
//		QuickSortThread qs3 = new QuickSortThread();
//		QuickSortThread qs4 = new QuickSortThread();
//		
//		qs1.start();
//		
//		try{
//			qs1.join();
//		}catch (InterruptedException e){}
//			
		
		
		System.out.println("BEFORE");
		ArrUtils.printArr(testArr);
				
		Quicksort.sort(testArr);
		System.out.println("AFTER");
		ArrUtils.printArr(testArr);
	}
	
}
