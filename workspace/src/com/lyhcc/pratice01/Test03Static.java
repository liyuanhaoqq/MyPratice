package com.lyhcc.pratice01;

public class Test03Static {
	static{
		/*��̬�����������ڱ�����ɺ�ֻ��ִ��һ��*/
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
		/*ԭ��static����鵱�౻װ��java�����ʱ���*/
	}
}
