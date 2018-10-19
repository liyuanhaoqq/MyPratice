package com.lyhcc.pratice02.demo02;

/*
 * 
 * 运行结果：
 * 构造方法一被调用了
 * 构造方法二被调用了
 * 构造方法三被调用了
 * 
 * 原因：在main函数中新建Test类对象，而将Boolean值true作为参数进行构造，之后执行Test(boolean x)函数，
 * 函数体中通过this(1)调用构造函数Test(int x)函数，在该函数体中this()调用Test()函数，输出"构造方法一被调用了",
 * 然后返回到调用处，输出"构造方法二被调用了"，继续返回调用该函数的地方，输出"构造方法三被调用了"，最后返回main函数中，
 * 程序运行结束
 */
public class Test {
	boolean x;

	public Test() {
		System.out.println("构造方法一被调用了");
	}

	public Test(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Test(Boolean x) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public static void main(String[] args) {
		Test test=new Test(true);
	}
	
}
