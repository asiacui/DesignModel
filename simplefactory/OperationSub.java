package asia.simplefactory;

public class OperationSub extends Operation{

	@Override
	public double getResult() {
		//返回两数只差A-B
		return this.getA()-this.getB();
	}

}
