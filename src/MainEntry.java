public class MainEntry {
	//Members
	private static Helper helper = new Helper();
	private static BigONotation bigO = new BigONotation();
	private static int[] iArray = helper.generateRandomArray(100);
	private static int[][] iArray2d = helper.generateRandom2dArray(100);
	private static int valueToSearch = 1001;
	private static int result;
	
	//Main entry for program
	public static void main(String[] args) {
		
		//Polynomial calc demos
		//30n^3 + 15n^2 + 10 = , n = 1
		printPolyDemo(1);
		//30n^3 + 15n^2 + 10 = , n = 10
		printPolyDemo(10);
		//30n^3 + 15n^2 + 10 = , n = 100
		printPolyDemo(100);
		
		//O(1) -- constant time search
		helper.timeTrackerStart();
		result = bigO.searchConstantTime(iArray);
		helper.timeTrackerStop();
		System.out.println("Index is: " + result + ", Time taken: " + helper.elapsedTimeInNano());
		
		//O(n) - linear time search
		helper.timeTrackerStart();
		result = bigO.searchNTime(iArray, valueToSearch);
		helper.timeTrackerStop();
		System.out.println("Index is: " + result + ", Time taken: " + helper.elapsedTimeInNano());
		
		//O(n^2) - squared time search
		
		//O(2n) - exponential time search
		
		//O(log n) - logarithmic time search
	}
	
	private static void printPolyDemo(int n) {
		System.out.println("30n^3 + 15n^2 + 10 = " + helper.polyDemo(n) + ", n = " + n);
		System.out.println("n^3: " + helper.cubeDemo(n) + ", n^2: " + helper.squaredDemo(n) + ", 10");
		System.out.println();
	}

}
