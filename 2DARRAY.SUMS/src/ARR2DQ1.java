// Q) Write A program that prints the sum of each row in a 2D array and column 
public class ARR2DQ1 {

	public static void main(String[] args) {
	int  [][] integers = {
			{ 1 , 2 , 3 , 4} ,
			{ 5 , 6 , 7 , 8 } , 
			{ 9 , 10, 11 ,12}
	} ;
	//int sum = 0 ; 
	for (int i = 0 ; i < 3; i ++) { 
		int sum = 0 ; 
		for (int  j = 0 ; j < 4 ; j++ ) { 
			sum += integers[j][i];
			
			System.out.println("Ihe sum of the row" + (i+1)+ sum ); 		
		}
	}

	}
}