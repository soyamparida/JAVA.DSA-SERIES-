 // Q)Declare and create a two-dimensional array of strings named colors. Put the colors (“red”, “yellow”, “blue”) in the first row, and the colors (“orange”, “green”, “purple”) in the second row. Then print every value in the array.
public class ARR2DQ8 {
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
	}
}