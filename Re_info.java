package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Ӧ�÷����API��ȡ�����Ϣ��������֣����ԣ�����������������
 * @author dell
 *
 */

public class Re_info {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		String path="Reflection.User";
		try {
			Class clz=Class.forName(path);
			//System.out.println(clz);
			
			//��ȡ�������
			System.out.println(clz.getName());//����.����
			System.out.println(clz.getSimpleName());//����
			//���������Ϣ
			Field[] field=clz.getFields();//ֻ�ܻ�ȡpublic��field��
			System.out.println(field.length);
			Field[] fields=clz.getDeclaredFields();//���Ի�����е�field
			System.out.println(fields.length);
			for(Field ff:fields) {
				System.out.println(ff);
			}
			Field f=clz.getDeclaredField("age");
			//������Ϣ
			Method[] method=clz.getMethods();//ֻ�ܻ�ȡpublic��method
			System.out.println(method.length);
			Method[] methods=clz.getDeclaredMethods();//���Ի�����е�method
			for(Method mm:methods) {
				System.out.println(mm);
			}
			Method m=clz.getDeclaredMethod("setName", String.class);//�������ص����⣬��Ҫ���ݲ�����	
			//������
			 Constructor[] constructors=clz.getDeclaredConstructors();
			 for(Constructor cc:constructors) {
				 System.out.println(cc);
			 }
			 System.out.println(clz.getDeclaredConstructor(null));
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
