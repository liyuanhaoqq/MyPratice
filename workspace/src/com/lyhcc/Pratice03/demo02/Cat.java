package com.lyhcc.Pratice03.demo02;

/*
 * ���н�������ķè����: 26.0��
 * 
 * Ը��
 * ���ȸ�Cat��ľ�̬������ֵ
 * (˵������̬���������࣬�����ڲ���������ʱֱ��ͨ������.������ֱ�ӽ��и�ֵ)
 * ��ֵ����nameΪ��ķè
 * ���Ŵ���һ��Cat�����Tom
 * �������ö����еı���weightΪ20
 * ������show()�����������ķè����: 26.0��
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
		System.out.println(name+"����: "+weight+"��");
	}
	public static void main(String[] args) {
		Cat.name="��ķè";
		Cat Tom=new Cat();
		Tom.setWeight(20);
		Tom.show();
	}
}
