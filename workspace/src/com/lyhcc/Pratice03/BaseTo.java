package com.lyhcc.Pratice03;


class base extends Object{
	 void speak(){
		System.out.println("fgjh");
	}
}
class Test extends base{
	 void speak(){
		System.out.println("DFGHJ");
	}
}

public class BaseTo extends Test {
	public static void main(String[] args) {
		Object A=new base();
		//((Base)A).speak();
		//((Test)A).speak();
		((base)A).speak();
	}


}
