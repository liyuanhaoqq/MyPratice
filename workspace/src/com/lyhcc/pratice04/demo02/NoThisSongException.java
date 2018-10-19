package com.lyhcc.pratice04.demo02;
/*
 * 异常类
 */
public class NoThisSongException extends Exception{//Exception的子类
	//构造方法
	
	//无参构造
	public NoThisSongException() {
		
	}
	//有参构造
	public NoThisSongException(String e) {
		super(e);
	}
}
