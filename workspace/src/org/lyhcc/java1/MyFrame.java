package org.lyhcc.java1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends Frame implements ActionListioner{
	private Button quit=new Button("Quit");
	public MyFrame() {
		super("Test Window");
		add(quit);
		pack();
		setVisible(true);
		quit.addActionListener((ActionListener) this);
	}
	public static void main(String[] args) {
		Frame myFrame=new MyFrame();		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		System.exit(0);
		
	}
	
}
