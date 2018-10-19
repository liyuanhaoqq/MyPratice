package org.lyhcc.java1.example6_9;

import java.awt.*;
import java.awt.event.*;

public class CountDown {

	ActionListener listener=null;
	Object source;
	int maxCount=10;
	public CountDown(Object source, int maxCount) {
		this.source = source;
		this.maxCount = maxCount;
	}
	public void addActionListener(ActionListener newListener){
		listener=AWTEventMulticaster.add(listener, newListener);
	}
	public void removeActionListener(ActionListener oldListener){
		listener= AWTEventMulticaster.remove(listener, oldListener);
	}
	public void startCounting(){
		if(listener!=null){
			for(int i=maxCount;i>=0;i--){
				System.out.println("i: "+i);
				System.out.println("Done. Generating event now ...");
				listener.actionPerformed(new ActionEvent(source, ActionEvent.ACTION_PERFORMED, "CountDown"));
			}
		}
	}
	
}
