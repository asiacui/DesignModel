package asia.simplefactory;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		// ��������֮������
		double result = 0;
		if(this.getB() == 0) 
		{	
			System.out.println("��ĸ����Ϊ�㣡");
			return -1;
		}
		result = this.getA()/this.getB();
		return result;
	}

}
