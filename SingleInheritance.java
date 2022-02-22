import java.util.*;
import java.util.Scanner;

class Father{
	String Name = "Joe";
	//String Address= "Tirunelveli";
}

class son extends Father{
	String Sonname = "Sam";
	
}
public class SingleInheritance {

	public static void main(String[]args) {
		
		son m = new son();
		System.out.println("Father name: " + m.Name);
		System.out.println("Son name: " + m.Sonname);
		
		
	}
}
