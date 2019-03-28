package testmodel;

import java.util.ArrayList;
import java.util.List;

public class output {

	public static void main(String[] args) {
		Mteashop mt = new Mteashop();
		//manager只能通过getMg函数获取
		Staff manager1 = Manager.getMg();
		Staff manager2 = Manager.getMg();
		Staff manager3 = Manager.getMg();
		//通过new创建VM对象
		Staff vm1 = new VM();
		Staff vm2 = new VM();
		Staff vm3 = new VM();
		//通过new创建Staff对象
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
//员工
class Staff{
	public void work()
	{
		//做事情
	}
}
//副店长
class VM extends Staff {

	@Override
	public void work() {
		//管理下面的员工
		super.work();
	}
}
//店长，饿汉单例模式
class Manager extends Staff{
	private static final Manager mg = new Manager();
	//构造函数私有
	private Manager(){
		
	}
	//公有静态函数，对外暴露获取单例对象的接口
	public static Manager getMg()
	{
		return mg;
		
	}
	@Override
	public void work() {
		super.work();
		//管理副店长
	}
	
}
//奶茶店类
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
			System.out.println("Obj："+per.toString());
		}
	}
}