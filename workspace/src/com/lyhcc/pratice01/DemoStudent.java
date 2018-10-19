package com.lyhcc.pratice01;

public class DemoStudent {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		stu1.setName("张三");
		stu1.setScore(80);
		System.out.println("我叫"+stu1.getName()+", 我的成绩为"+stu1.getScore()+"分");//我叫张三, 我的成绩为80分
		
		Student stu2=new Student("李四",90);
		System.out.println("我叫"+stu2.getName()+", 我的成绩为"+stu2.getScore()+"分");//我叫李四, 我的成绩为90分
		
		

	}

}
