package com.basic.tu.override;

public class MyOverride implements IOverride{

	/**
	 * 子类覆盖父类的方法时，只能比父类抛出更少的异常，或者是抛出父类抛出的异常的子异常，
	 * 因为子类可以解决父类的一些问题，不能比父类有更多的问题
	 */
	@Override
	public void testOverride() throws NullPointerException{
		// TODO Auto-generated method stub
		
	}

}
