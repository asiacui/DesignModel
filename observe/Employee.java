package asia.observe;

public class Employee implements Runnable {
	Child  c;
	Father f;
	
	public Employee(Child c,Father f){
		this.c = c;
		this.f = f;
	}
	@Override
	public void run() {
		int count = 0;
		while(!c.isWakeup()){
			try {
				Thread.sleep(1000);
				count++;
				System.out.println("baby is sleeping "+count+"s");
				if(count==5) {
					c.setWakeup(true);
					System.out.println("The baby id calling by employee" + count);
					f.feed(c);
					return;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		f.feed(c);
	}

}
