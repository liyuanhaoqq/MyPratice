package com.lyhcc.pratice04.demo02;

public class Player {
	
	void play(int index) throws NoThisSongException{//在该方法内不处理该异常
		if(index>10){
		  NoThisSongException e=new NoThisSongException("您播放的歌曲不存在");
		  throw e;//index大于10，新建NoThisSongException类对象，并抛出该异常
		}
	}
}
