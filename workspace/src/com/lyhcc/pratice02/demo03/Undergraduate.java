package com.lyhcc.pratice02.demo03;


public class Undergraduate extends Student{

	//属性
	
	//1、继承Student类的name和age属性
	
	//2、学生学位
	String degree;


	
	//构造函数
	
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	public Undergraduate(String name, int age) {
		super(name, age);
	}
	@Override
	void show(){
		System.out.println("我叫"+super.name+",今年"+super.age+"岁"+",获有"+degree+"学位");
	}
}
