import java.util.Scanner;
public class finalizeExample {
	public static void main(String[]args)
	{
		
		finalizeExample obj = new finalizeExample();
	//	System.out.println("Hashcode is:"+obj.hashCode());
		obj = null;
		
		System.gc();
		System.out.println("End of the garbage collection");
		
	}
	
	protected void finalize() {
		
		System.out.println("Called the finalize()method");
	}
}
