package asia.simplefactory;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		// 返回两数之相除结果
		double result = 0;
		if(this.getB() == 0) 
		{	
			System.out.println("分母不能为零！");
			return -1;
		}
		result = this.getA()/this.getB();
		return result;
	}

}
