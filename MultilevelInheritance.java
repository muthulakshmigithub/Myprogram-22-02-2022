import java.util.Scanner;
import java.util.*;

class Father1{
	String Name = "Joe";
	//String Address= "Tirunelveli";
}

class son1 extends Father1{
	String Sonname = "Sam";
	
}

class Grandfather extends son1{
	String GrandName = "Jack";
	
}
public class MultilevelInheritance {
	
	public static void main(String[]args) {
		
		Grandfather m = new Grandfather();
		System.out.println("grandfather name: " + m.GrandName);
		System.out.println("Father name: " + m.Name);
		System.out.println("Son name: " + m.Sonname);

	}

}
