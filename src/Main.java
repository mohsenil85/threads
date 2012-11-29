
public class Main {
	public static void main(String [] args){
		
		Integer[] testArr = ArrUtils.creatArr(10);
		
		
		System.out.println("BEFORE");
		ArrUtils.printArr(testArr);
		
		try{
			Quicksort.sort(testArr);
		}catch (IndexOutOfBoundsException e){
			System.out.println("FAILURE");
		}
			
		System.out.println("AFTER");
		ArrUtils.printArr(testArr);
	}
	
}
