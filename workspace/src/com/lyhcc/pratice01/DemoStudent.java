package com.lyhcc.pratice01;

public class DemoStudent {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		stu1.setName("����");
		stu1.setScore(80);
		System.out.println("�ҽ�"+stu1.getName()+", �ҵĳɼ�Ϊ"+stu1.getScore()+"��");//�ҽ�����, �ҵĳɼ�Ϊ80��
		
		Student stu2=new Student("����",90);
		System.out.println("�ҽ�"+stu2.getName()+", �ҵĳɼ�Ϊ"+stu2.getScore()+"��");//�ҽ�����, �ҵĳɼ�Ϊ90��
		
		

	}

}
