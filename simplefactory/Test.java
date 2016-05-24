package asia.simplefactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
//		Operation op = OperationFactory.getInstace("/");
//		
//		double result = 0;
//		op.setA(3);
//		op.setB(18.4);
//		result = op.getResult();
//		
//		System.out.println(result);
//		
//		InputStream in = Test.class.getClassLoader().getResourceAsStream("resource/es.properties");
//		Properties properties = new Properties();
//		try {
//			properties.load(in);
//			String s = properties.getProperty("ImplClass");
//			String[] arrs = s.split(",");
//			for(String arr: arrs)
//				System.out.println(arr);
//			Operation op = (Operation)Class.forName(arrs[0].trim()).newInstance();
//			op.setA(3);
//			op.setB(18.4);
//			Object result = op.getResult();
//			System.out.println(result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
		
		OperationFactoryReflection.addOperation("factory.properties");
		ArrayList<Operation> instanceList = OperationFactoryReflection.getOperationInstace();
		
		for(Operation instance:instanceList){
			instance.setA(3);
			instance.setB(8);
			System.out.println(instance.getResult());
		}
	}
}
