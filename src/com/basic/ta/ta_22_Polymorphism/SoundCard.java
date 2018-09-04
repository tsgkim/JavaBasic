package com.basic.ta.ta_22_Polymorphism;

/** 
 * 
 * 让声卡实现usb接口
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月6日 下午2:17:14 
*/
public class SoundCard implements Usb {

	@Override
	public void read() {
		System.out.println("声卡有接受声音的功能");

	}

	@Override
	public void write() {
		System.out.println("声卡游发出声音的功能");
	}

}
