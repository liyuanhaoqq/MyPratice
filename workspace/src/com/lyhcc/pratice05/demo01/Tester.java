package java2.pratice05.demo01;

public class Tester {
	public static void main(String[] args) {
		Withdraw withdraw=new Withdraw(new Account(5000));
		new Thread(withdraw,"我").start();
		
		new Thread(withdraw, "老妈").start();
		
	}
}
