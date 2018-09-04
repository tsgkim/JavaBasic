package com.basic.ta.ta_22_Polymorphism;

import org.junit.Test;

/** 
 * 
 * 用接口实现多态的特征
 * 
 * 电脑上需要用到u盘，鼠标，键盘等等这些配件，电脑不会去为这些配件一一做个接口，
 * 而是在电脑上做个usb接口，这些配件厂商都按这个usb接口定义的参数去生产就行了，
 * 这样插不同的配件在电脑上就可以实现不同的功能。
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月6日 下午2:11:46 
*/
public class Computer {

	private Usb  usb; //在电脑上声明一个usb接口

	public Usb getUsb() {
		return usb;
	}

	public void setUsb(Usb usb) {
		this.usb = usb;
	}
	
	public void work(){  //让这个接口工作，发挥功能
		usb.read();
		usb.write();
	}
	
	@Test
	public void testComputer(){
		setUsb(new UDisk());
		work();
		System.out.println("===================");
		
		setUsb(new SoundCard());
		work();
	}
	
}
