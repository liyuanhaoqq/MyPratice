package com.lyhcc.pratice02.demo02;

/*
 * 
 * ���н����
 * ���췽��һ��������
 * ���췽������������
 * ���췽������������
 * 
 * ԭ����main�������½�Test����󣬶���Booleanֵtrue��Ϊ�������й��죬֮��ִ��Test(boolean x)������
 * ��������ͨ��this(1)���ù��캯��Test(int x)�������ڸú�������this()����Test()���������"���췽��һ��������",
 * Ȼ�󷵻ص����ô������"���췽������������"���������ص��øú����ĵط������"���췽������������"����󷵻�main�����У�
 * �������н���
 */
public class Test {
	boolean x;

	public Test() {
		System.out.println("���췽��һ��������");
	}

	public Test(int x) {
		this();
		System.out.println("���췽������������");
	}
	public Test(Boolean x) {
		this(1);
		System.out.println("���췽������������");
	}
	public static void main(String[] args) {
		Test test=new Test(true);
	}
	
}
