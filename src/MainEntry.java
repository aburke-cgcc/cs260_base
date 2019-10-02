import java.util.Arrays;

public class MainEntry {
	//Members
	private static Helper helper = new Helper();
	private static BigONotation bigO = new BigONotation();
	private static int arraySize;
	private static int[] iArray;
	private static int[][] iArray2d;
	private static int valueToSearch;
	private static int intResult;
	private static long longResult;
	private static int[] resultArr;
	
	//Main entry for program
	public static void main(String[] args) {
		//Build and size arrays
		arraySize = 100;
		iArray = helper.generateRandomArray(arraySize);
		iArray2d = helper.generateRandom2dArray(arraySize);
		
		//Value to search for with array examples
		valueToSearch = 5000;
		
		//Make sure arrays are sorted for later 
		//examples in exponential and logarithm search
		Arrays.sort(iArray, 0, iArray.length - 1);
		
		for(int i = 0; i < iArray2d.length; i++) {
			Arrays.sort(iArray2d[i], 0, iArray2d[i].length - 1);
		}
		
		//Polynomial calc demos
		//30n^3 + 15n^2 + 10 = , n = 1
		helper.printPolyDemo(1);
		//30n^3 + 15n^2 + 10 = , n = 10
		helper.printPolyDemo(10);
		//30n^3 + 15n^2 + 10 = , n = 100
		helper.printPolyDemo(100);
		
		//O(1) -- constant time search
		helper.timeTrackerStart();
		intResult = bigO.searchConstantTime(iArray);
		helper.timeTrackerStop();
		System.out.println("Index is: " + intResult + ", Constant Time taken: " + helper.elapsedTimeInNano());
		
		//O(n) - linear time search
		helper.timeTrackerStart();
		intResult = bigO.searchLinearTime(iArray, valueToSearch);
		helper.timeTrackerStop();
		System.out.println("Index is: " + intResult + ", Linear Time taken: " + helper.elapsedTimeInNano());
		
		//O(n^2) - quadratic time search
		helper.timeTrackerStart();
		resultArr = bigO.searchQuadraticTime(iArray2d, valueToSearch);
		helper.timeTrackerStop();
		System.out.println("Index is: {" + resultArr[0] + ","+ resultArr[1] +"}, Quadratic Time taken: " + helper.elapsedTimeInNano());
		
		//O(2n) - exponential time example
		helper.timeTrackerStart();
		longResult = bigO.fibonacci(35);
		helper.timeTrackerStop();
		System.out.println("Fibonacci Result is: " + longResult + ", Quadratic Time taken: " + helper.elapsedTimeInNano());
		
		//O(log n) - logarithmic time search
		helper.timeTrackerStart();
		intResult = bigO.searchLogarithmicTime(iArray, valueToSearch);
		helper.timeTrackerStop();
		System.out.println("Index is: " + intResult + ", Linear Time taken: " + helper.elapsedTimeInNano());
	}

}
