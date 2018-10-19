package org.lyhcc.java1.example6_9;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CountDownTester extends Frame implements ActionListener{

	
	private Button start=new Button("Start");
	private Button show=new Button("Show");
	private TextField display=new TextField(25);
	private CountDown count=new CountDown(show, 25);
	private class WindowCloser extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public CountDownTester() {
	
		super("CountDown Tester");
		setLayout(new FlowLayout());
		add(start);
		add(show);
		add(display);
		show.addActionListener(this);
		start.addActionListener(this);
		count.addActionListener(this);
		addWindowListener(new WindowCloser());
		pack();
		setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start){
			count.startCounting();
		}
		else if(e.getSource()==show){
			display.setText("Event come from: "+e.getActionCommand());
		}
		
	}
	public static void main(String[] args) {
		CountDownTester c=new CountDownTester();
	}
	
}
