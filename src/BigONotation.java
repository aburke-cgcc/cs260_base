
public class BigONotation {
	/** Constant time example
	 * @param items integer array
	 * @return always return index 0
	 */
	public int searchConstantTime(int[] items) {
		int i = 0;
		
		return i;
	}
	
	/** Squared time example
	 * @param items integer array
	 * @param valueToSearch integer value to search for in integer array
	 * @return return index of value searched for; -1 if not found
	 */
	public int searchNTime(int[] items, int valueToSearch) {
		int i = 0;
		
		do {
			if(items[i] == valueToSearch)
				//return index if value is found
				return i;
			i++;
		} while(i < items.length);
		
		//return -1 if not found
		return -1;
	}
}
