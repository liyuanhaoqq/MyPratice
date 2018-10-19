package com.lyhcc.pratice02.demo01;

/*
 * 运行结果为
 * A
 * B
 * 原因： A为B的子类，在新建B对象后，运行B类中的test()函数，因为在父类与子类中函数重名时优先运行新建的对象所属类的
 * 而在这道题中在B类中的test()函数中又通过super.test()运行A中的test()函数，输出A，然后在运行B类中test()
 * 函数中super.test()，接着的语句，输出B
 */
public class A {
	public static void main(String[] args) {
		B b=new B();
		b.test();
	}
	void test(){
		System.out.println("A");
	}
}
