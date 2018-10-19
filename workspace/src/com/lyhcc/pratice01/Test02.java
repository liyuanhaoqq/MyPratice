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
		/*原因：调用test函数后，执行test 函数体print（），然后运行print函数体，*/
	}
	
}
