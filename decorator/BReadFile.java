package asia.decorator;

import java.io.IOException;
import java.io.InputStream;

public class BReadFile implements Runnable{
	private InputStream in;
	
	public BReadFile(InputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		int c = 0;
		try {
			synchronized(in){
				while((c=in.read()) >= 0){
					System.out.println("I am B..."+(char)c);
					Thread.sleep(100);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
