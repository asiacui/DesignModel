package asia.simplefactory;

public class Test {
	public static void main(String[] args) {
		Operation op = OperationFactory.getInstace("/");
		
		double result = 0;
		op.setA(3);
		op.setB(18.4);
		result = op.getResult();
		
		System.out.println(result);
		
	}
}
