package asia.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("G://tmp//asia.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		
//		int c;
//		while((c = in.read()) >= 0 ){
//			System.out.print((char)c);
//		}
//		
		ReadFile rf = new ReadFile(in);
		BReadFile brf = new BReadFile(in);
		
		Thread t1 = new Thread(rf);
		Thread t2 = new Thread(brf);
		
		t1.start();
		t2.start();
		
	}

}
