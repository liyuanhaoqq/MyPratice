package com.lyhcc.pratice04.demo02;
/*
 * 运行结果：您播放的歌曲不存在
 */
public class Tester {
	public static void main(String[] args) {
		Player player=new Player();//创建Player类对象
		try {
			player.play(11);//调用Player类的实例方法
		} catch (Exception e) {
			System.out.println(e.getMessage());//输出异常信息
		}
	}
}
