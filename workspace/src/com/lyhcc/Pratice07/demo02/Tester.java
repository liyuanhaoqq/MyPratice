package com.lyhcc.Pratice07.demo02;
/*
 2、定义TreeMapComparator类，实现Comparator接口，重写compare方法，实现比较key的长度。
 给TReeMap<String>指定比较器为TreeMapComparator类对象，创建TreeMap类对象 ,
 加入("1", "Jack")、("232", "Rose")、("33", "Lucy")三对值,
 遍历该对象，输出如下key值长度从大到小排列的键值对。
 */
import java.util.*;

public class Tester {
	public static void main(String[] args) {
		TreeMap<String, String> map=new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length()-o1.length();
			}
		});
		map.put("1", "Jack");
		map.put("232", "Rose");
		map.put("33", "Lucy");
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry=(Map.Entry<String, String>)(it.next());
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
