import java.util.Scanner;
import java.util.*;

class Father2{
	String Name = "Joe";
	//String Address= "Tirunelveli";
}

class son2 extends Father2{
	String Sonname = "Sam";
	
}

class Grandfather1 extends Father2{
	String GrandName = "Jack";
	
}
public class HierarchicalInheritance {
	
	public static void main(String[]args) {
		
		son s = new son();
		Grandfather m = new Grandfather();
		System.out.println("grandfather name: " + m.GrandName);
		System.out.println("Father name: " + m.Name);
		System.out.println("Son name: " + s.Sonname);

	}

}
