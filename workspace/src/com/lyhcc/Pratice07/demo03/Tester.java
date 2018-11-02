package com.lyhcc.Pratice07.demo03;
/*
 * 
 运行结果：
10
10
20
20
20
30
30

 */
public class Tester {
	static int x=10;
	public Tester(int _x) {
		System.out.println(x);//输出10
		x=_x;				  //x值改为_x的值
		System.out.println(x);//输出的是_x的值20
	}
	static{//静态代码块只执行一次，且在虚拟机时运行
		System.out.println(x);
	}
	public void print(){
		System.out.println(x);//调用print函数时输出x值
	}
	public static void main(String[] args) {
		Tester t1=new Tester(20);//创建Tester类对象
		t1.print();				//调用print函数
		Tester t2=new Tester(30);//创建Tester类对象
		t2.print();//调用print函数
	}
}
