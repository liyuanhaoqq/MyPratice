package com.lyhcc.Pratice03.demo03;
/*
 * ���н����4.0+6.0i
 * 
 * �½�FS��Ķ���c1,c2�����½�����ʱ���ô��ι��캯�������������add(FS p)������
 * ʵ�����������
 */
public class FS {
	private float s;
	private float x;
	
	public FS() {
		this(0, 0);
	}

	public FS(float s, float x) {
		this.s = s;
		this.x = x;
	}
	public void add(FS p){
		FS result = new FS();
		result.s=this.s +p.s;
		result.x=this.x+p.x;
		System.out.println(result.s+"+"+result.x+"i");
	}
	public static void main(String[] args) {
		FS c1=new FS(1,2);
		FS c2=new FS(3,4);
		c1.add(c2);
	}
}
