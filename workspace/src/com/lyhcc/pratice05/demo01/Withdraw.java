package java2.pratice05.demo01;

public class Withdraw implements Runnable{

	private Account account;
	
	public Withdraw(Account account) {
		this.account = account;
	}

	@Override
	public  void run(){
		
			while(account.getMoney()>0){
				synchronized ("lock") {
					try {
						
						/*if(Thread.currentThread().getName()=="我")
							Thread.sleep(1000);*/
						if(account.getMoney()-200>=0)
						{
							
							double leave;
							String str=new String();
							
							account.setMoney((leave=account.getMoney()-200));
							System.out.println(Thread.currentThread().getName()+"取款200元  "+"当前余额： "+leave);
							
						}
						/*if(Thread.currentThread().getName()=="老妈")
							Thread.sleep(1000);*/
						Thread.sleep(1000);		
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				}
		}
	}

}
