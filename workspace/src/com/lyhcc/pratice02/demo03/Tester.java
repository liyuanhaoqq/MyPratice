package com.lyhcc.pratice02.demo03;

/*
 * ���н����
 * �ҽ�����,����20��,���б���ѧλ
 * �ҽ�����,����19����
 * 
 * ԭ���ȴ���һ��������(Undergraduate)����󣬵��ù��캯����
 * �ȸ���������ĸ���Student���м̳�����������(name,age)��ֵ,
 * �ٸ������е�degree���Ը�ֵ��
 * ��󱾿������е�show()������������ҽ�����,����20��,���б���ѧλ
 * 
 * �ٴ���һ��ѧ��(Student)�࣬���ù��캯�������ö��������(name,age)��ֵ��
 * Ȼ����ø����show()������������ҽ�����,����19����
 */
public class Tester {
	public static void main(String[] args) {
		Student undergraduate=new Undergraduate("����", 20,"����");
		undergraduate.show();
		
		Student student=new Student("����", 19);
		student.show();
	}
	
}
