package com.lyhcc.pratice01;
/**
 * 
 * @author liyuanhao
 * 
 *
 */

public class Test01 {

	int x=30;
	void method(int y){
		int x=y*y;
	}
	public static void main(String[] args) {
		int x=20;
		Test01 ts=new Test01();
		ts.method(x);
	
		System.out.println("The x value is "+x);//The x value is 20
		/*
		 * 原因：在程序运行时，如果创建对象的类中成员变量和当前执行所在方法的局部变量重名，优先使用该方法中的局部变量
		 * 	   并且，对于基本数据类型，在调用，method（x）;时，进行x=y*y并不会改变method调用时的实参
		 * 	
		 */
	}

}
