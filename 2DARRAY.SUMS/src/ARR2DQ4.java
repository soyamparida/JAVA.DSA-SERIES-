 /*Print out the sum of the numbers in the second row of the “nums” array.
Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18
*/
public class ARR2DQ4 {
	public static void main(String[] args) {
		 
		int[][]arr = { {1,4,9}
		               ,{11,4,3}
		                ,{2,2,3} };
		int sum = 0 ; 
		// sum of the 2nd row elements 
		for (int j = 0 ; j<arr.length ; j ++ ) { 
			sum += arr [1][j];
		}
	System.out.println("Sum is :" + sum ) ; 
	 
	}
}
