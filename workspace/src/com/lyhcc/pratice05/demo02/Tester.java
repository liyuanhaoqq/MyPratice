package java2.pratice05.demo02;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.Random;

public class Tester extends Frame implements ActionListener{
	private TextField textField=new TextField();
	private Button start=new Button("Start");
	private Button quit=new Button("Quit");
	private TextField[] tField=new TextField[10];
	private class WindowClosing extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);	
		}
	}
	public Tester() {
		super("随机概率");
		start.addActionListener(this);
		quit.addActionListener(this);
		addWindowListener(new WindowClosing());
		Panel line=new Panel();
		line.setLayout(new FlowLayout());
		line.add(textField);
		line.add(start);
		line.add(quit);
		Panel buttons =new Panel();
		buttons.setLayout(new GridLayout(2, 11));
		buttons.setFont(new Font("Arial", Font.BOLD, 30));
		Button X=new Button("X");X.setEnabled(false);
		buttons.add(X);
		for(int i=1;i<=9;i++) {
			String s="";
			s=s+i;
			Button button=new Button(s);
			button.setEnabled(false);
			buttons.add(button);
		}
		Button P=new Button("P");pack();P.setEnabled(false);
		buttons.add(P);
		for(int i=1;i<=9;i++) {
			tField[i]=new TextField();
			tField[i].setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
			//tField[i].setText("");
			buttons.add(tField[i]);
		}
		setLayout(new BorderLayout());
		add("North", line);
		add("Center", buttons);
		setSize(600, 150);
		setVisible(true);
	}
	private int[] cal(int n) {
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Random r=new Random();
		for(int i=0;i<n;i++) {
			int x=r.nextInt(9)+1;
			a[x]++;
		}
		return a;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int num;
		if(e.getSource()==start&&!textField.getText().trim().equals("")&&(num=check(textField.getText().trim()))!=-1) {
			//System.out.println(num);
			int[] a=cal(num);
			for(int i=1;i<=9;i++) {
				String s="";
				BigDecimal f=new BigDecimal((double)a[i]/num);
				s=s+(f.setScale(4, BigDecimal.ROUND_HALF_UP));
				tField[i].setText(s);
			}
		}
		else if(e.getSource()==quit){
			dispose();
			 System.exit(0);
		}
		
	}
	private int check(String s) {
		int flag=0;
		char[] charArray=s.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]<'0'||charArray[i]>'9') {
				flag=-1;
				break;
			}
			flag=flag*10+charArray[i]-'0';
		}
		//System.out.println(flag);
		return flag;
	}
	public static void main(String[] args) {
		new Tester();
	}
}
