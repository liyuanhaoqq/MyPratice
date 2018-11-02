package com.lyhcc.Pratice06.demo02;
/*
 * 2����HashSet�������������Person���󣬰�������ͬ���˵���ͬһ���ˣ�
 * ��ֹ�ظ���ӡ� ��ʾ�� Person���ж���name��age���ԣ�
 * ��дhashCode()������equals()���������Person���name���Խ��бȽϣ�
 * ���name��ͬ��hashCode()�����ķ���ֵ��ͬ��
 */
/*
 * ���н����[������ �   ���䣺 20, ������ ����   ���䣺 30, ������ ����   ���䣺 18]
 */
import java.util.HashSet;
import java.util.Set;

class Person{
	//����
	
	//1������
	String name;
	//2������
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return"������ "+this.name+"   ���䣺 "+this.age;
	}
	public int hashCode(){
		return name.hashCode();
	}
	public boolean equals(Object obj){
		if(this == obj)return true;
		if(!(obj instanceof Person))return false;
		return this.name.equals(((Person)obj).name);
	}
}
public class Tester {
	public static void main(String[] args) {
		HashSet set =new HashSet();
		Person aPerson=new Person("����",18);
		Person bPerson=new Person("�", 20);
		Person cPerson=new Person("����", 30);
		Person dPerson=new Person("����", 20);
		set.add(aPerson);
		set.add(bPerson);
		set.add(cPerson);
		set.add(dPerson);
		System.out.println(set);
	}

}
