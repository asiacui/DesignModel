package asia.simplefactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class OperationFactoryReflection {
	
	static ArrayList<Operation> opeList = new ArrayList<Operation>();
	private static Properties properties = new Properties();//单例模式，相当于直接存内存做缓存，即把硬盘上的东西放内存做缓存
	
	public static void addOperation(String filepath){
		
		InputStream in = Test.class.getClassLoader().getResourceAsStream("resource/"+filepath);
		
		try {
			properties.load(in);
			String s = properties.getProperty("ImplClass");
			String[] arrs = s.split(",");
			for(String arr: arrs){
				//通过传入的字符串（代表的类），利用反射机制创建具体的实例对象并添加进入List中
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
