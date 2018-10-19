package com.lyhcc.pratice04.demo01;
/*
 * 运行结果：体积之差为：1570.7963267948967
 * 
 */
public class Tester {
	public static void main(String[] args) {
		Solid solid1=new Cylinder();//创建一个圆柱对象，使用默认值初始化
		Solid solid2=new Cylinder(5,20);//创建一个圆柱对象，半径为5，高为20
		System.out.print("体积之差为：");
		System.out.println(minusVolume(solid1, solid2));//计算两个圆柱的体积之差
		//System.out.println(solid1.getColor());
	}
	public static double minusVolume(Solid a,Solid b){//该函数用于计算两圆柱体积之差
		return Math.abs(a.volume()-b.volume());
	}
}
