package java2.pratice05.demo02;

import java.util.Random;
import java.util.Scanner;

public class Tester2 {
	public static void main(String[] args) {
		System.out.print("请输入样本空间： ");
		int n=new Scanner(System.in).nextInt();
		int[] a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Random r=new Random();
		for(int i=0;i<n;i++) {
			int x=r.nextInt(9)+1;
			//System.out.println(x);
			a[x]++;
		}
		for(int i=1;i<10;i++) {
			System.out.println("随机数产生为"+i+"的概率是： "+((double)a[i])/n);
		}
	}//规律：当n足够大的时候，每个数产生的概率接近1/n
}
