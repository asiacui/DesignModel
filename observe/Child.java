package asia.observe;

public class Child implements Runnable{
	private boolean wakeup = false;
	Father f = new Father();
	
	public Child(Father f){
		this.f = f;
	}
	public boolean isWakeup() {
		return wakeup;
	}

	public void setWakeup(boolean wakeup) {
		this.wakeup = wakeup;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			System.out.println(5+"s");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		f.feed(this);
	}
	
}
