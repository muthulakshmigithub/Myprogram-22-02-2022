import java.util.Scanner;
public class finalExample {
	
	final int age =18;
	void display() {
		System.out.println(age);
		//compile time error
	//	age = 55;
	}
	
	public static void main(String[]args) {
		finalExample obj = new finalExample();
		
		obj.display();
		
	}

}
