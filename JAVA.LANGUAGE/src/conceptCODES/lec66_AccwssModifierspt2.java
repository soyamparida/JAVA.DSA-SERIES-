package conceptCODES;
class student1 { 
    //private String name  ; // Private 
	String name ; // IT IS DEFAULT SO IT WORK 
	private int age  ;  // Private 
	private int rollno ; // private
//	protected int rollno ;it can accessable from different package and inheret student class from another class it can be accessable 
	student1 (String name,int age ,int rollno){
		this.name= name;
		this.age = age; 
		this.rollno = rollno ; 
	}
	void print () { 
		System.out.println(name); 
		System.out.println(age);
		System.out.println(rollno);
		// here it is no error cause its inside the class 
	}
	
		
	}

public class lec66_AccwssModifierspt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1 = new student1 ("soyam", 34 , 1) ; 
		/*
		 s1.age=34 ; 
		 s1.name = "soyam"; 
		 s1.rollno=  46 ; 
		 // now this values will go to void and we can print it by creating the object print!!
		 s1.print();
		 */
		// it will show a error but for diff class its not accessable  
	s1.print(); 
    System.out.println(s1.name); // IT GIVES THE OUTPUT 
	}

}
