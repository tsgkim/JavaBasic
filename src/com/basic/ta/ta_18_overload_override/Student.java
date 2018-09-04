package com.basic.ta.ta_18_overload_override;

/** 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月1日 下午6:52:37 
*/
public class Student extends Person{

	@Override
	protected void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	/*@Override          重写父类的方法时，方法的返回值类型必须与父类相同
	public int getSex() {       
		// TODO Auto-generated method stub
		return 0;
	}*/

	/*@Override         重写父类的方法时，子类的范围修饰符必须大于或等于父类的范围修饰符
	private void setName(String name) {   
		// TODO Auto-generated method stub
		super.setName(name);
	}*/
	
	
}
