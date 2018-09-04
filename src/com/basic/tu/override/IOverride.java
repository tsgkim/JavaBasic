package com.basic.tu.override;

/**
 * 重写Override表示子类中的方法可以与父类中的某个方法的名称和参数完全相同，通过子类创建的实例对象调用这个方法时，
 * 将调用子类中的定义方法，这相当于把父类中定义的那个完全相同的方法给覆盖了，这也是面向对象编程的多态性的一种表现
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 创建时间：2017年8月31日 上午10:54:44
 */
public interface IOverride {

	/**
	 * 测试覆盖
	 */
	void testOverride() throws Exception;

}
