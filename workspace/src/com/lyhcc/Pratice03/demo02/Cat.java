package com.lyhcc.Pratice03.demo02;

/*
 * 运行结结果：汤姆猫体重: 26.0斤
 * 
 * 愿因：
 * 首先个Cat类的静态变量赋值
 * (说明：静态变量属于类，可以在不创建对象时直接通过类名.变量名直接进行赋值)
 * 赋值变量name为汤姆猫
 * 接着创建一个Cat类对象Tom
 * 接着设置对象中的变量weight为20
 * 最后调用show()函数，输出汤姆猫体重: 26.0斤
 */
public class Cat {

	private float weight=6.0f;
	private static String name;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight += weight;
	}
	public void show(){
		System.out.println(name+"体重: "+weight+"斤");
	}
	public static void main(String[] args) {
		Cat.name="汤姆猫";
		Cat Tom=new Cat();
		Tom.setWeight(20);
		Tom.show();
	}
}
