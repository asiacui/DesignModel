package asia.observe;

public class Father{

//	@Override
//	public void run() {
//		int count = 0;
//		while(!c.isWakeup()){
//			try {
//				
//				Thread.sleep(1000);
//				count ++;
//				System.out.println("The time is "+count);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		feed(c);
//	}
	
	public void feed(Child c){
		System.out.println(c.isWakeup()+"  ณิทนทน...");
	}
	
}
