package com.lyhcc.pratice04.demo01;

import java.awt.geom.Area;
/*
 * solid接口的实现类
 */
public class Cylinder implements Solid{

	//属性
	
	//1、圆柱半径
	protected double radius=10;
	//2、圆柱高度
	protected double height=10;
	
	//构造函数
	
	//1、无参构造
	public Cylinder() {

	}
	//2、全参构造
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	
	public double Area(){//计算圆柱底面积
		return Math.PI*radius*radius;
	}
	@Override
	public double volume() {//计算圆柱底面积
		return Area()*height;
	}
	
	@Override
	public String getColor() {//返回圆柱颜色
		return color;
	}

}
