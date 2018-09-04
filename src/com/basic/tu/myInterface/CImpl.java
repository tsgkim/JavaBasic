package com.basic.tu.myInterface;

public class CImpl implements IC {

	@Override
	public void testIA() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * IC 已经 extends IA  所以有该覆盖方法
	 */
	@Override
	public void testIC() {
		System.out.println("CImpl===>testIC");
		
	}

	
	
}
