package Reflection;
/**
 * ���Ը������ͣ�class,interface,enum,Annotation,int[],String��java.lang.Class����Ļ�ȡ��ʽ��
 * @author dell
 *
 */
@SuppressWarnings("all")
public class Re_class {
	public static void main(String[] args) {
		String path="Reflection.User";
		try {
			//���е����Ͷ����Ӧһ��Class����
			Class clz=Class.forName(path);
			//�����Ǳ�ʾ���װһЩ���ݣ�һ���౻���ػ�Ź��JVM�ᴴ��һ����Ӧ�����Class������������ṹ��Ϣ
			//�ᱻ�ŵ���Ӧ��Class�����С����Class�������һ�澵��һ��������ͨ�����澵�ӿ��Կ�����Ӧ���ȫ����Ϣ��
			System.out.println(clz);
			System.out.println(clz.hashCode());
			
			//ͬ��һ����ֻ��Ӧһ��Class����
			Class clzz=Class.forName(path);
			System.out.println(clzz.hashCode());
		    Class strClz=String.class;
		    Class strClzz=path.getClass();
		    System.out.println(strClz==strClzz);
		    Class intclz=int.class;
		    int[] arr01=new int[10];
		    int[] arr02=new int[20];
		    //����һά�����ClassΪͬһ�������۳��ȡ�
		    System.out.println(arr01.getClass().hashCode());
		    System.out.println(arr02.getClass().hashCode());
		    int[][] arr=new int[3][4];
		    System.out.println(arr.getClass().hashCode());
		    double[] darr=new double[2];
		    System.out.println(darr.getClass().hashCode());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
