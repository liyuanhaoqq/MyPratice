package com.lyhcc.pratice02.demo03;


public class Undergraduate extends Student{

	//����
	
	//1���̳�Student���name��age����
	
	//2��ѧ��ѧλ
	String degree;


	
	//���캯��
	
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	public Undergraduate(String name, int age) {
		super(name, age);
	}
	@Override
	void show(){
		System.out.println("�ҽ�"+super.name+",����"+super.age+"��"+",����"+degree+"ѧλ");
	}
}
