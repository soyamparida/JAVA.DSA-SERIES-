
public class ARR2DQ9 {

	public static void main(String[] args) {
	
		 String[][] colors = {
		            {"red", "yellow", "blue"},
		            {"orange", "green", "purple"}
		        };

		        // Print every value in the array
		        System.out.println("Values in the array:");
		        for (int i = 0; i < colors.length; i++) {
		            for (int j = 0; j < colors[i].length; j++) {
		                System.out.print(colors[i][j] + " ");
		            }
		            System.out.println(); // Move to the next line after printing each row
		        }
		    /*
		        	This outer loop iterates over each row of the colors array.
		        	i is the index of the current row being processed.
		        	for ( int j = 0; j < colors[i].length; j++) {:

		        	This inner loop iterates over each element within the current row specified by colors[i].
		        	colors[i] represents the i-th row of the colors array.
		        	colors[i].length returns the number of elements (columns) in the i-th row.
		        	j is the index of the current element within the current row.
		        	*/
		        }
                }
