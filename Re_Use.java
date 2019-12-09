package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ͨ������API��̬�����������������ԣ�����
 * @author dell
 *
 */

public class Re_Use {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		String path="Reflection.User";
		try {
			Class<User> clz=(Class<User>)Class.forName(path);
			//ͨ������API���ù�����÷������������
			User u=clz.newInstance();//������User���޲ι��졣
			Constructor<User> c=clz.getDeclaredConstructor(int.class,String.class,int.class);
			User user=c.newInstance(1001,"С��",18);//ָ��ʵ��
			System.out.println(user.getName());
			//ͨ������API��̬������ͨ����
			User u3=clz.newInstance();
			Method method=clz.getDeclaredMethod("setName", String.class);
			method.invoke(u3, "С��");//u3.setName("С��")
			System.out.println(u3.getName());
			//ͨ������API��ȡ����
			User u4=clz.newInstance();
			Field f=clz.getDeclaredField("name");
			f.setAccessible(true);//������Բ���Ҫ��ȫ��飬����ֱ�ӷ���˽������
			f.set(u4, "С��");//ͨ������ֱ��д����
			System.out.println(f.get(u4));//ͨ������ֱ�Ӷ�����
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
