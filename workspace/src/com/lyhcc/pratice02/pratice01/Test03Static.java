package com.lyhcc.pratice01;

public class Test03Static {
	static{
		/*静态代码块的内容在编译完成后只会执行一次*/
		System.out.println("Hi there");// Hi here
	}
	public void print(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Test03Static test=new Test03Static();
		test.print();//Hello
		Test03Static test2=new Test03Static();
		test2.print();//Hello
		/*原因：static代码块当类被装入java虚拟机时输出*/
	}
}
