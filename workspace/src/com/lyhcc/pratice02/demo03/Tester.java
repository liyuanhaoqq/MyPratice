package com.lyhcc.pratice02.demo03;

/*
 * 运行结果：
 * 我叫王五,今年20岁,获有本科学位
 * 我叫李四,今年19岁了
 * 
 * 原因：先创建一个本科生(Undergraduate)类对象，调用构造函数，
 * 先给本科生类的父类Student类中继承下来的属性(name,age)赋值,
 * 再给本科中的degree属性赋值，
 * 最后本科生类中的show()函数，输出：我叫王五,今年20岁,获有本科学位
 * 
 * 再创建一个学生(Student)类，调用构造函数，给该对象的属性(name,age)赋值，
 * 然后调用该类的show()函数，输出：我叫李四,今年19岁了
 */
public class Tester {
	public static void main(String[] args) {
		Student undergraduate=new Undergraduate("王五", 20,"本科");
		undergraduate.show();
		
		Student student=new Student("李四", 19);
		student.show();
	}
	
}
