package testmodel;
import java.util.*;
public class ArrayLitTest {

	public static void main(String[] args) {
		//����ArrayList
		  ArrayList list = new ArrayList();
		//������
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		//�������Ԫ����ӵ���һ��λ��
		list.add(0,"5");
		//��ȡ��һ��Ԫ��
		System.out.println("the first element is:"+list.get(0));
		//ɾ��"3"
		list.remove("3");
		//��ȡArrayList�Ĵ�С
		System.out.println("Arraylist size =:"+list.size());
		//�ж�list���Ƿ����"3"
		System.out.println("Arraylist contains 3 is :"+list.contains(3));
		list.set(1, "10");
		// ͨ��Iterator����ArrayList
       for(Iterator iter = list.iterator(); iter.hasNext(); ) {
		          System.out.println("next is: "+ iter.next());
	    }
       //��ArrayListת��Ϊ����
       String[] arr = (String[])list.toArray(new String[0]);
       for(String str:arr)
       {
    	   System.out.println("str:"+str);
       }
       //���ArrayList
       list.clear();
       //�ж�ArrayList�Ƿ�Ϊ��
       System.out.println("ArrayList is empty:"+list.isEmpty());
       
	}

}
