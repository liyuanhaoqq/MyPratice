package com.lyhcc.Pratice06.demo02;
/*
 * 2、在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，
 * 禁止重复添加。 提示： Person类中定义name和age属性，
 * 重写hashCode()方法和equals()方法，针对Person类的name属性进行比较，
 * 如果name相同，hashCode()方法的返回值相同。
 */
/*
 * 运行结果：[姓名： 李东   年龄： 20, 姓名： 张三   年龄： 30, 姓名： 李明   年龄： 18]
 */
import java.util.HashSet;
import java.util.Set;

class Person{
	//属性
	
	//1、姓名
	String name;
	//2、年龄
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return"姓名： "+this.name+"   年龄： "+this.age;
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
		Person aPerson=new Person("李明",18);
		Person bPerson=new Person("李东", 20);
		Person cPerson=new Person("张三", 30);
		Person dPerson=new Person("张三", 20);
		set.add(aPerson);
		set.add(bPerson);
		set.add(cPerson);
		set.add(dPerson);
		System.out.println(set);
	}

}
