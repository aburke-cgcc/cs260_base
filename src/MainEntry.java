public class MainEntry {
	//Members
	private static Helper helper = new Helper();
	private static BigONotation bigO = new BigONotation();
	private static int[] iArray = helper.generateRandomArray(100);
	private static int[][] iArray2d = helper.generateRandom2dArray(100);
	private static int result;
	
	//Main entry for program
	public static void main(String[] args) {
		
		//O(1) -- constant time search
		helper.timeTrackerStart();
		result = bigO.searchConstantTime(iArray);
		helper.timeTrackerStop();
		System.out.println("Value is: " + result + ", Time taken: " + helper.elapsedTimeInNano());
		
		//O(n) - linear time search
		helper.timeTrackerStart();
		result = bigO.searchNTime(iArray, 55);
		helper.timeTrackerStop();
		System.out.println("Value is: " + result + ", Time taken: " + helper.elapsedTimeInNano());
		
		
	}

}
