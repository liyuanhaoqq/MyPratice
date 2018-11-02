package com.lyhcc.Pratice06.demo01;
/*
 * 1�������������ʵ�������Զ��ۻ����������ܣ�
	��1������һ��Java������Drink�� 
		a)	����һ�����󷽷�getPrice()���÷�������������ϵļ۸� 
		b)	����int���͵����ݳ�ԱjuiceType����ʾ��ͬ���������ͣ����ȡ�ơ�ơ�ţ�̣�
		c)	������̬����getDrink(int drinkType)�����ݴ���Ĳ���������ͬ�����϶��󣬲����ظö��󣬽���ʹ��switch��䡣�÷���Ҫ������DrinkNotFoundException����û�����Ӧ����������ʱ���׳����쳣�� 
	��2������Drink�ľ������ࣺ 
		a)	�ֱ���Drink�����ࣺCoffee�������ȣ���Beer������ơ�ƣ���Milk������ţ�̣�; 
		b)	ʵ��price()��������ʾ���ϼ۸� 
	��3���Զ����쳣��NoThisDrinkException 
		a)	��Drink�ķ���getDrink(int drinkType)����������NoThisDrinkException�쳣��������Ĳ���û�����Ӧ����������ʱ���׳��쳣�� 
		b)	��ʹ��getDrink���������в�׽���쳣��
	��4������Test�����࣬�����������ݵ���ȷ�� 
		a)	��дmain������ͨ�������д��εķ�ʽ����ĳ�����ϵ����͡�
		b)	��main�����У�����Drink���getDrink�����������Ӧ�����϶���ע�Ⲷ��NoThisDrinkException�� 
		c)	���ø����϶����getPrice()��������������ϵļ۸�
 */
/*
 * ���н����
 */
import java.util.Scanner;

class Coffee extends Drink{

	@Override
	public void getPrice() {
		System.out.println("�����ۼۣ� " +"10��");
	}
	
}
class Beer extends Drink{

	@Override
	public void getPrice() {
		System.out.println("ơ���ۼۣ� " +"3��");
		
	}
	
}
class Milk extends Drink{

	@Override
	public void getPrice() {
		System.out.println("ţ���ۼۣ� " +"5��");
	}
	
}
class DrinkNotFoundException extends Exception{
	public DrinkNotFoundException() {
		super("NoThisDrinkException");
	}
	
}
abstract class Drink {
	//����
	
	//1����������
	int juiceType;
	
	//����������������ͽ��д�����Ӧ�����϶���
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
	//���󷽷�,���������Ӧ���ϼ۸�
	public abstract void getPrice();
	
}
public class Tester{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("��ܰ��ʾ�� ��Ӧ��ţ�1������;2��ơ��;3��ţ�̣�");
			System.out.print("����������Ҫ�����ϱ��: ");
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