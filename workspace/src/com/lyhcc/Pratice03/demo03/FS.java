package com.lyhcc.Pratice03.demo03;
/*
 * 运行结果：4.0+6.0i
 * 
 * 新建FS类的对象c1,c2，在新建对象时调用带参构造函数，结束后调用add(FS p)函数，
 * 实现虚数的求和
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
