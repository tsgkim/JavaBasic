package com.basic.ta.ta_22_Polymorphism;

/** 
 * 
 * 让U盘实现usb接口
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月6日 下午2:14:29 
*/
public class UDisk implements Usb {

	@Override
	public void read() {
		System.out.println("u盘有读的功能");

	}

	@Override
	public void write() {
		System.out.println("u盘有写的功能");

	}

}
