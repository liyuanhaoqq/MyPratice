package com.lyhcc.pratice01;

public class Test02 {
	public static void test(){
		/*Cannot use this in a static context*/
//		this.print();
		print();
	}
	public static void print(){
		System.out.println("Test");//Test
	}
	public static void main(String[] args) {
		test();//Test
		/*ԭ�򣺵���test������ִ��test ������print������Ȼ������print�����壬*/
	}
	
}
