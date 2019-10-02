
public class BigONotation {
	/** Constant time example
	 * @param items integer array
	 * @return int
	 */
	public int searchConstantTime(int[] items) {
		return items[0];
	}
	
	/** Constant time example
	 * @param items integer array
	 * @param value integer value to search for
	 * @return int
	 */
	public int searchNTime(int[] items, int value) {
		int i = 0;
		
		do {
			if(items[i] == value)
				//return index if value is found
				return i;
			i++;
		} while(i < items.length);
		
		//return -1 if not found
		return -1;
	}
}
