package com.lyhcc.Pratice03.demo01;


/*
 * ���н����
 * 4.0
 * 28.274333882308138
 * 
 * ԭ��
 * (˵��:�ֿ�Shape���г����������ڼ���ͼ��������ýֿ�������ʵ���࣬
 * ������Square���Բ��(Ciecle)�࣬����ʵ�����ж��Խֿ��еĳ��󷽷����и�����д)
 * 
 * ���ȴ���Square�����square������ֵ�߳�edgeֵΪ2
 * ����area()�����������������
 * 
 * ���Ŵ���һ��Circle����󣬸�ֵ�ö���ı���radiusΪ3��
 * ����area()����Բ�ε����
 */
public class Tester {
	public static void main(String[] args) {
		//������
		Square square=new Square(2);
		System.out.println(square.area());
		
		//Բ��
		Circle circle =new Circle(3);
		System.out.println(circle.area());
	}
}
