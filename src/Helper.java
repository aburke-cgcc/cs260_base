import java.util.Random;

public class Helper{
    //#region Members
    private Random random;
    private long startTime;
    private long endTime;
    //#endregion
    
    //constructor
    public Helper(){
        random = new Random(System.currentTimeMillis());
    }

    //#region MemberFunctions
    /** Generates a random int array of n(input) size.
     * @param n Integer size of random array.
     * @return int[] array
     */
    public int[] generateRandomArray(int n){
        int[] iArray = new int[n];

        for (int i = 0; i < n; i++)
            iArray[i] = (int)(Math.random() * 1000) + 10;

        return iArray;
    }

    /** Generates a random 2d int array of n(input) size.
     * @param n Integer size of random array.
     * @return int[] array
     */
    public int[][] generateRandom2dArray(int n){
        //instnatiate 2d array of n size
        int[][] iArray = new int[n][];

        //for all elements, make a nested array of random size between 1 and 10
        for (int i = 0; i < iArray.length; i++){
            int randArrSize = generateRandomIntBetweenRange(1, 10);
            int[] nestedArray = generateRandomArray(randArrSize);
            iArray[i] = nestedArray;
        }

        return iArray;
    }

    /** Generates a random int between range.
     * @param min Lower bound of the random numbers possible.
     * @param max Upper bound of the random numbers possible
     * @return int result of randomly generated number between min and max
     */
    public int generateRandomIntBetweenRange(int min, int max){
        //Use init random object member
        int randomInt = random.nextInt((max - min) + 1) + min;

        return randomInt;
    }

    /** Calculates polynomial function 30n^3 + 15n^2 + 10
     * @param n Set n to value.
     * @return int result of calculating polynomial
     */
    public int polyDemo(int n){
        return (30 * (n*n*n)) + (15 * (n*n)) + 10;
    }

    /** Calculate coefficient and n^3 from 30n^3 + 15n^2 + 10
     * @param n Set n to value.
     * @return int result of calculating first term of polynomial.
     */
    public int cubeDemo(int n){
        return 30 * (n*n*n);
    }

    /** Calculate coefficient and n^2 from 30n^3 + 15n^2 + 10
     * @param n Set n to value.
     * @return int result of calculating second term of polynomial.
     */
    public int squaredDemo(int n){
        return 15 * (n * n);
    }

    /** Get current time for tracker start
     * @return void.
     */
    public void timeTrackerStart(){
        startTime = System.nanoTime();
    }

    /** Get current time for tracker end
     * @return void.
     */
    public void timeTrackerStop(){
        endTime = System.nanoTime();
    }

    /** Get elapsed time of stored start and end time in nano seconds
     * @return long.
     */
    public long elapsedTimeInNano(){
        return endTime - startTime;
    }

    /** Get elapsed time of stored start and end time in milliseconds
     * @return long.
     */
    public long elapsedTimeInMilli(){
        return (endTime - startTime) / 1000000;
    }
    //#endregion
}