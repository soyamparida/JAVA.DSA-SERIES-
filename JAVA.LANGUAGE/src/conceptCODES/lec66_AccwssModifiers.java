package conceptCODES;
class student { 
	String name  ; // default
	int age  ;  // default
	int rollno ; // default
	void print () { 
		System.out.println(name); 
		System.out.println(age);
		System.out.println(rollno);
	}
}
public class lec66_AccwssModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 student s1 = new student () ; 
 s1.age=34 ; 
 s1.name = "soyam"; 
 s1.rollno=  46 ; 
 // now this values will go to void and we can print it by creating the object print!!
 s1.print();
	}

}
