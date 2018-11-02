package com.lyhcc.Pratice06.demo01;
/*
 * 1、完成以下任务，实现饮料自动售货机基本功能：
	（1）建立一个Java抽象类Drink： 
		a)	声明一个抽象方法getPrice()，该方法负责输出饮料的价格； 
		b)	声明int类型的数据成员juiceType，表示不同的饮料类型（咖啡、啤酒、牛奶）
		c)	声明静态方法getDrink(int drinkType)，根据传入的参数创建不同的饮料对象，并返回该对象，建议使用switch语句。该方法要求声明DrinkNotFoundException，当没有相对应的饮料类型时，抛出该异常。 
	（2）定义Drink的具体子类： 
		a)	分别定义Drink的子类：Coffee（代表咖啡），Beer（代表啤酒），Milk（代表牛奶）; 
		b)	实现price()方法，显示饮料价格。 
	（3）自定义异常类NoThisDrinkException 
		a)	在Drink的方法getDrink(int drinkType)中声明引发NoThisDrinkException异常，当传入的参数没有相对应的饮料类型时，抛出异常。 
		b)	在使用getDrink方法的类中捕捉该异常。
	（4）建立Test测试类，测试以上内容的正确性 
		a)	编写main方法，通过命令行传参的方式传入某种饮料的类型。
		b)	在main方法中，调用Drink类的getDrink方法，获得相应的饮料对象。注意捕获NoThisDrinkException。 
		c)	调用该饮料对象的getPrice()方法，输出该饮料的价格。
 */
/*
 * 运行结果：
 */
import java.util.Scanner;

class Coffee extends Drink{

	@Override
	public void getPrice() {
		System.out.println("咖啡售价： " +"10￥");
	}
	
}
class Beer extends Drink{

	@Override
	public void getPrice() {
		System.out.println("啤酒售价： " +"3￥");
		
	}
	
}
class Milk extends Drink{

	@Override
	public void getPrice() {
		System.out.println("牛奶售价： " +"5￥");
	}
	
}
class DrinkNotFoundException extends Exception{
	public DrinkNotFoundException() {
		super("NoThisDrinkException");
	}
	
}
abstract class Drink {
	//属性
	
	//1、饮料类型
	int juiceType;
	
	//根据输入的饮料类型进行创建对应的饮料对象
	public static Object getDrink(int drinkType) throws DrinkNotFoundException{
		
		switch (drinkType) {
			case 1:
				return new Coffee();
			case 2: 
				return new Beer();
			case 3:
				return new Milk();
			default:
				throw new DrinkNotFoundException();
		}
	}
	//抽象方法,用于输出对应饮料价格
	public abstract void getPrice();
	
}
public class Tester{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("温馨提示： 对应编号（1、咖啡;2、啤酒;3、牛奶）");
			System.out.print("请输入你需要的饮料编号: ");
			int type=sc.nextInt();
			try {
				Drink drink=(Drink)Drink.getDrink(type);
				drink.getPrice();
				
			} catch (DrinkNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}
}