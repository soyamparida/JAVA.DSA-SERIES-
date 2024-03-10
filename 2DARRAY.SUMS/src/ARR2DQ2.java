// write a java programm that prints the maximum of each row in a 2D array 
public class ARR2DQ2 {

	public static void main(String[] args) {
		int  [][] integers = {
				{ 1 , 2 , 3 , 4} ,
				{ 5 , 6 , 7 , 8 } , 
				{ 9 , 10, 11 ,12}

	};
		for (int i = 0 ; i< 3 ; i ++)
			System.out.println("row" + ":" + getMax(integers[i]));
	}
		/*
for(int i = 0 ; i < 3 ; i ++) {
	int max = integers[0] ; 
	//int max = integers[i][0];
	/*
	for (int j = 1 ; j< 4 ; j ++){
		max = (integers[i][j]> max) ? integers[i][j] : max ; 
	// if the current element if greater than the maximum then we got a new maximum so the maximum be equal to current element if this is not true it will stay as it is  
	System.out.println("Row" + (i+1) + ":"+ max);
	*/
		private static int getMax (int []integers){
			int max = integers [0] ; 
			for (int i = 0 ; i <integers.length ; i ++)
				max = (max<integers[i]) ? integers [i]: max ;
			return max ;
}
		}