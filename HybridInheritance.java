import java.util.Scanner;
import java.util.*;

class Father3{
	String Name = "Joe";
	//String Address= "Tirunelveli";
}

class son3 extends Father3{
	String Sonname = "Sam";
	
}

class Grandfather2 extends Father3{
	String GrandName = "Jack";
	
}


class Sister extends son3{
	
	String sisterName= "Rose";
}
public class HybridInheritance {
	
	public static void main(String[]args) {
		Sister sr = new Sister();
		//son s = new son();
		Grandfather m = new Grandfather();
		System.out.println("grandfather name: " + m.GrandName);
		System.out.println("Father name: " + m.Name);
		System.out.println("Son name: " + m.Sonname);
		System.out.println("Sister name: " + sr.sisterName);

	}

}
