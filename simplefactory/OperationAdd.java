package asia.simplefactory;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		//返回两数之和
		return this.getA()+this.getB();
	}

}
