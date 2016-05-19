package asia.simplefactory;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		// 返回两数之积
		return this.getA()*this.getB();
	}

}
