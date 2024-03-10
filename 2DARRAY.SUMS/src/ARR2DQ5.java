/* Q)Write a program to Find Transpose of a Matrix.What is Transpose?Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
Matrix
a11    a12    a13
a21    a22    a23
Transposed Matrix
a11    a21
a12    a22
a13    a23
*/
public class ARR2DQ5{
	public static void main(String[] args) {
		int row = 2 ; 
		int column = 3 ; 
		int [] [] matrix = {{2,3,7} , {5 , 6 , 7} };
		// Display original matrix 
		printMatrix(matrix) ; 
		
		// Transpose the matrix 
		int [] [] transpose = new int [column] [row] ;
		for (int i = 0 ; i <row ; i ++ ) { 
			for (int j = 0 ; j<column ; j++) { 	
			transpose [j][i] = matrix[i][j] ; 
		}
	}
	// print the transposed 
	printMatrix(transpose) ; 
}
		public  static void printMatrix(int [][]matrix){
			System.out.println("The matrix is :" );
			for (int i = 0; i<matrix.length; i++ ) {
			for (int j = 0; j < matrix[0].length ;  j++){ 
					System.out.println(matrix[i][j] + " ") ;
				}
				System.out.println();
			}
		}
		
	}


