package com.lyhcc.Pratice03.demo01;


/*
 * 运行结果：
 * 4.0
 * 28.274333882308138
 * 
 * 原因：
 * (说明:街口Shape中有抽象函数，用于计算图形面积，该街口有两个实现类，
 * 正方形Square类和圆形(Ciecle)类，两个实现类中都对街口中的抽象方法进行覆盖重写)
 * 
 * 首先创建Square类对象square，并赋值边长edge值为2
 * 调用area()方法计算正方形面积
 * 
 * 接着创建一个Circle类对象，赋值该对象的变量radius为3；
 * 调用area()计算圆形的面积
 */
public class Tester {
	public static void main(String[] args) {
		//正方形
		Square square=new Square(2);
		System.out.println(square.area());
		
		//圆形
		Circle circle =new Circle(3);
		System.out.println(circle.area());
	}
}
