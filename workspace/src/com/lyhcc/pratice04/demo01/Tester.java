package com.lyhcc.pratice04.demo01;
/*
 * ���н�������֮��Ϊ��1570.7963267948967
 * 
 */
public class Tester {
	public static void main(String[] args) {
		Solid solid1=new Cylinder();//����һ��Բ������ʹ��Ĭ��ֵ��ʼ��
		Solid solid2=new Cylinder(5,20);//����һ��Բ�����󣬰뾶Ϊ5����Ϊ20
		System.out.print("���֮��Ϊ��");
		System.out.println(minusVolume(solid1, solid2));//��������Բ�������֮��
		//System.out.println(solid1.getColor());
	}
	public static double minusVolume(Solid a,Solid b){//�ú������ڼ�����Բ�����֮��
		return Math.abs(a.volume()-b.volume());
	}
}
