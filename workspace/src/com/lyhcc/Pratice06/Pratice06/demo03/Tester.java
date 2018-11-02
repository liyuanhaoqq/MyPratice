package com.lyhcc.Pratice06.demo03;

import java.util.*;

/* 
完成下列要求： 
1）以老师的名字作为键，以老师教授的课程名作为值，将上述课程安排存入Map类对象。 
2） 增加一位新老师Allen 教JDBC 。
3） Lucy 改为教CoreJava （ put方法，Key一样，会覆盖之前的值）。
4） 遍历Map，输出所有的老师及老师教授的课程。
 */
public class Tester {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put("Tom", "CoreJava");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Unix");
		map.put("Kevin", "JSP");
		map.put("Lucy", "JSP");
		print(map);
		System.out.println("***************************");
		map.put("Allen", "JDBC");
		print(map);
		System.out.println("***************************");
		map.put("Lucy", "CoreJava");
		print(map);
		
	}
	public static void print(HashMap map){
		Set enSet=map.entrySet();
		Iterator it = enSet.iterator();
		while(it.hasNext()){
			Map.Entry entry=(Map.Entry)it.next();
			Object teacher=entry.getKey();
			Object subject=entry.getValue();
			System.out.println("老师： "+teacher+"    课程： "+subject);
			
		}
	}
}
