
public class ARR2DQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };

	        System.out.println("First row:");
	        printRow(array, 0);
//array: This is the 2D array that we want to print the row from.
//0: This is the index of the row we want to print. In Java, array indices start from 0, so 0 represents the first row.        
	        System.out.println("\nLast row:");
	        printRow(array, array.length - 1);
	    }

	    // Method to print a specific row of a 2D array
	    public static void printRow(int[][] array, int rowIndex) {
	        for (int i = 0; i < array[rowIndex].length; i++) {
	            System.out.print(array[rowIndex][i] + " ");
	            /*for (int i = 0; i < array[rowIndex].length; i++) {:

This line initializes a for loop that iterates over each element in the row specified by rowIndex.
i is the loop variable, which starts from 0 and increments by 1 in each iteration until it reaches the length of the row.
System.out.print(array[rowIndex][i] + " ");:

Inside the loop, this line prints each element of the row followed by a space.
array[rowIndex][i] retrieves the element at index i in the row specified by rowIndex.
System.out.print is used instead of System.out.println to print all elements on the same line, separated by spaces.
	        }
*/
	}
	    }
}
