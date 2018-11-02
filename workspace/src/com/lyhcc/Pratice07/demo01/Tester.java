package com.lyhcc.Pratice07.demo01;
/*
 1、定义一个泛型类XPoint，包含私有数据成员：x(横坐标）、y（纵坐标）；包含构造方法、setXX和getXX方法分别可以设置和获取x和y的值。定义测试类，创建两个整数坐标点对象和两个浮点左边点对象，分别打印两点的距离。


 */
class PointX<X> {
	private X x;
	private X y;
	public PointX(X x,X y) {
		this.x=x;
		this.y=y;
	}
	
	public X getX() {
		return this.x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public X getY() {
		return this.y;
	}

	public void setY(X y) {
		this.y = y;
	}

	public void setXX(X x,X y){
		this.x=x;
		this.y=y;
	}

	
}
public class Tester{
	public static void main(String[] args) {
		PointX<Integer> p1=new PointX(0, 0);
		PointX<Integer> p2=new PointX(3, 4);
		System.out.println(mylength(p1.getX(),p1.getY(),p2.getX(),p2.getY()));
		PointX<Double> p3=new PointX(0.0, 0.0);
		PointX<Double> p4=new PointX(0.6,0.8);
		System.out.println(mylength(p3.getX(),p3.getY(),p4.getX(),p4.getY()));
	}
	public static int mylength(int x1,int y1,int x2,int y2){
		return (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	public static double mylength(double x1,double y1,double x2,double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
}
