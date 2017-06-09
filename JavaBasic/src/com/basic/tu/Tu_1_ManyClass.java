package com.basic.tu;

/**
 * Q:一个java类源文件能不能包含多个类（不包括内部类）？<br>
 * A: 只能有一个public 声明类
 * 	  Tu_1_ManyClass编译之后会产生Tu_1_ManyClass.class  Tu_1_ManyClass$D.class   C.class
 * 
 * @author 涂世广
 * @qq 1515503123
 * @date 创建时间：2017年6月1日 上午11:54:44
 */
public class Tu_1_ManyClass {
	class D {
	}
}

class C {
	String str = "c";
}

//这里会报错
//private class B {
//	String str = "b";
//}