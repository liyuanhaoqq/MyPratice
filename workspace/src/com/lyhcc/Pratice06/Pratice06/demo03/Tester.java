package com.lyhcc.Pratice06.demo03;

import java.util.*;

/* 
�������Ҫ�� 
1������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ���������γ̰��Ŵ���Map����� 
2�� ����һλ����ʦAllen ��JDBC ��
3�� Lucy ��Ϊ��CoreJava �� put������Keyһ�����Ḳ��֮ǰ��ֵ����
4�� ����Map��������е���ʦ����ʦ���ڵĿγ̡�
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
			System.out.println("��ʦ�� "+teacher+"    �γ̣� "+subject);
			
		}
	}
}
