package com.lyhcc.pratice04.demo02;

public class Player {
	
	void play(int index) throws NoThisSongException{//�ڸ÷����ڲ�������쳣
		if(index>10){
		  NoThisSongException e=new NoThisSongException("�����ŵĸ���������");
		  throw e;//index����10���½�NoThisSongException����󣬲��׳����쳣
		}
	}
}
