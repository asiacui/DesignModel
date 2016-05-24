package asia.simplefactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class OperationFactoryReflection {
	
	static ArrayList<Operation> opeList = new ArrayList<Operation>();
	private static Properties properties = new Properties();//����ģʽ���൱��ֱ�Ӵ��ڴ������棬����Ӳ���ϵĶ������ڴ�������
	
	public static void addOperation(String filepath){
		
		InputStream in = Test.class.getClassLoader().getResourceAsStream("resource/"+filepath);
		
		try {
			properties.load(in);
			String s = properties.getProperty("ImplClass");
			String[] arrs = s.split(",");
			for(String arr: arrs){
				//ͨ��������ַ�����������ࣩ�����÷�����ƴ��������ʵ��������ӽ���List��
				Operation tmp = (Operation)Class.forName(arr).newInstance();
				opeList.add(tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Operation> getOperationInstace(){
		return opeList;
	}
}
