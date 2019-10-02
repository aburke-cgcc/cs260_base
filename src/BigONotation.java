
public class BigONotation {
	/** Constant time example
	 * @param items integer array
	 * @return always return index 0
	 */
	public int searchConstantTime(int[] items) {
		int i = 0;
		
		return i;
	}
	
	/** Linear search scale example
	 * @param items integer array
	 * @param valueToSearch integer value to search for in integer array
	 * @return return index of value searched for; -1 if not found
	 */
	public int searchLinearTime(int[] items, int valueToSearch) {
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
	
	/** Quadratic search scale example
	 * @param items integer array
	 * @param valueToSearch integer value to search for in integer array
	 * @return return index of value searched for; -1 if not found
	 */
	public int[] searchQuadraticTime(int[][] items, int valueToSearch) {
		for(int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length; j++) {
				if(items[i][j] == valueToSearch)
					return new int[] {i, j};
			}
		}
		
		return new int[] {-1, -1};
	}
	
	/** Quadratic sort scale example
	 * 
	 */
	
	/** Exponential scale example
	 * @param n integer value to begin fibonacci sequence
	 * @return return final value from fibonacci sequence
	 */
	public long fibonacci(int n) 
    { 
        //Return n if 1 or less
        if (n <= 1) 
            return n; 
        
        //calculate fibonacci sequence and return using recursion
        return fibonacci(n-1) + fibonacci(n-2); 
    }
	
	/** Logarithmic search scale example
	 * @param items integer array
	 * @param valueToSearch integer value to search for in integer array
	 * @return return index of value searched for; -1 if not found
	 */
	public int searchLogarithmicTime(int[] items, int valueToFind) {

        int firstIndex = 0;
        int lastIndex = items.length - 1;
    
        // termination condition (element isn't present)
        while(firstIndex <= lastIndex) {
            //find the middle index
        	int middleIndex = (firstIndex + lastIndex) / 2;
            
            // if the middle element is our goal element, return its index
            if (items[middleIndex] == valueToFind) {
                return middleIndex;
            }
    
            // if the middle element is smaller
            // point our index to the middle+1, taking the first half out of consideration
            else if (items[middleIndex] < valueToFind)
                firstIndex = middleIndex + 1;
    
            // if the middle element is bigger
            // point our index to the middle-1, taking the second half out of consideration
            else if (items[middleIndex] > valueToFind)
                lastIndex = middleIndex - 1;
    
        }
        
        //Return -1 if index isn't found
        return -1;
    }
}
