package com.lyhcc.pratice04.demo01;

import java.awt.geom.Area;
/*
 * solid�ӿڵ�ʵ����
 */
public class Cylinder implements Solid{

	//����
	
	//1��Բ���뾶
	protected double radius=10;
	//2��Բ���߶�
	protected double height=10;
	
	//���캯��
	
	//1���޲ι���
	public Cylinder() {

	}
	//2��ȫ�ι���
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	
	public double Area(){//����Բ�������
		return Math.PI*radius*radius;
	}
	@Override
	public double volume() {//����Բ�������
		return Area()*height;
	}
	
	@Override
	public String getColor() {//����Բ����ɫ
		return color;
	}

}
