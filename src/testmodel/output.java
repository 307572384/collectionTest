package testmodel;

import java.util.ArrayList;
import java.util.List;

public class output {

	public static void main(String[] args) {
		Mteashop mt = new Mteashop();
		//managerֻ��ͨ��getMg������ȡ
		Staff manager1 = Manager.getMg();
		Staff manager2 = Manager.getMg();
		Staff manager3 = Manager.getMg();
		//ͨ��new����VM����
		Staff vm1 = new VM();
		Staff vm2 = new VM();
		Staff vm3 = new VM();
		//ͨ��new����Staff����
		Staff staff1 = new Staff();
		Staff staff2 = new Staff();
		Staff staff3 = new Staff();
		mt.addStaff(manager1);
		mt.addStaff(manager2);
		mt.addStaff(manager3);
		mt.addStaff(vm1);
		mt.addStaff(vm2);
		mt.addStaff(vm3);
		mt.addStaff(staff1);
		mt.addStaff(staff2);
		mt.addStaff(staff3);
		mt.showAllStaffs();
		
	}

}
//Ա��
class Staff{
	public void work()
	{
		//������
	}
}
//���곤
class VM extends Staff {

	@Override
	public void work() {
		//���������Ա��
		super.work();
	}
}
//�곤����������ģʽ
class Manager extends Staff{
	private static final Manager mg = new Manager();
	//���캯��˽��
	private Manager(){
		
	}
	//���о�̬���������Ⱪ¶��ȡ��������Ľӿ�
	public static Manager getMg()
	{
		return mg;
		
	}
	@Override
	public void work() {
		super.work();
		//�����곤
	}
	
}
//�̲����
class Mteashop {
	 List<Staff> allStaffs = new ArrayList<Staff>();
	public void addStaff(Staff per)
	{
		allStaffs.add(per);
		
	}
	public void showAllStaffs()
	{
		for(Staff per:allStaffs)
		{
			System.out.println("Obj��"+per.toString());
		}
	}
}