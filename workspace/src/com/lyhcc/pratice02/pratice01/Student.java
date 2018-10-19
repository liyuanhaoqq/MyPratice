package com.lyhcc.pratice01;

public class Student {
	
	//属性
	private String name;//姓名
	private int score;//成绩
	//Student类的有参构造函数
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
