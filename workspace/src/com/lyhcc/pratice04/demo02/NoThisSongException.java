package com.lyhcc.pratice04.demo02;
/*
 * �쳣��
 */
public class NoThisSongException extends Exception{//Exception������
	//���췽��
	
	//�޲ι���
	public NoThisSongException() {
		
	}
	//�вι���
	public NoThisSongException(String e) {
		super(e);
	}
}
