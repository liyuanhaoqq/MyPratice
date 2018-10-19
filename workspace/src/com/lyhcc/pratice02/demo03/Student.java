package com.lyhcc.pratice02.demo03;

public class Student {

	//属性
	
	//1、姓名
	String name;
	
	//2、年龄
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void show(){
		System.out.println("我叫"+name+",今年"+age+"岁了");
	}
}
