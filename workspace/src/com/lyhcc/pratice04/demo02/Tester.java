package com.lyhcc.pratice04.demo02;
/*
 * ���н���������ŵĸ���������
 */
public class Tester {
	public static void main(String[] args) {
		Player player=new Player();//����Player�����
		try {
			player.play(11);//����Player���ʵ������
		} catch (Exception e) {
			System.out.println(e.getMessage());//����쳣��Ϣ
		}
	}
}
