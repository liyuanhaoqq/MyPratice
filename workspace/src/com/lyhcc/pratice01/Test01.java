package com.lyhcc.pratice01;
/**
 * 
 * @author liyuanhao
 * 
 *
 */

public class Test01 {

	int x=30;
	void method(int y){
		int x=y*y;
	}
	public static void main(String[] args) {
		int x=20;
		Test01 ts=new Test01();
		ts.method(x);
	
		System.out.println("The x value is "+x);//The x value is 20
		/*
		 * ԭ���ڳ�������ʱ�����������������г�Ա�����͵�ǰִ�����ڷ����ľֲ���������������ʹ�ø÷����еľֲ�����
		 * 	   ���ң����ڻ����������ͣ��ڵ��ã�method��x��;ʱ������x=y*y������ı�method����ʱ��ʵ��
		 * 	
		 */
	}

}
