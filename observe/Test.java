package asia.observe;

import java.io.FileInputStream;
import java.util.Observable;

public class Test {
	public static void main(String[] args) {
		
		Father f = new Father();
		Child c = new Child(f);
		
		
		
//		Employee employee = new Employee(c,f);
		
//		Thread t1 = new Thread(father);
		Thread t2 = new Thread(c);
		
//		t1.start();
		t2.start();
		

	}
}
