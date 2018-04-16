import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Fool extends JFrame implements MouseListener,ActionListener{

	JLabel title1,title2,imgLabel0,l1,l2,imgLabel,imgLabel2,imgLabel3,imgLabel4;
	JPanel panel0,panel1,panel2;
	JButton yes,no,exit,exit2,tryagain,replay;
	ImageIcon img0,img,img2,img3,img4;
	
	
	public Fool()
	{
		super("Fool Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,720);
		
		panel0 = new JPanel();
		panel0.setLayout(null);
		
		title1=new JLabel("WELCOME TO FOOL GAME");
		title1.setBounds(120,70,400,150);
		title1.setFont(new Font("Castellar",Font.BOLD,25));
		title1.setForeground(Color.WHITE);
		title1.setOpaque(false);
		panel0.add(title1);
		
		title2=new JLabel("Are you a Fool?");
		title2.setBounds(155,215,350,50);
		title2.setFont(new Font("Felix Titling",Font.ITALIC,20));
		title2.setForeground(Color.WHITE);
		title2.setOpaque(false);
		panel0.add(title2);
		
		yes=new JButton("YES");
		yes.setBounds(160,280,90,50);
		yes.setBackground(Color.GRAY);
		yes.setForeground(Color.CYAN);
		yes.addMouseListener(this);
		yes.addActionListener(this);
		panel0.add(yes);

		
		no=new JButton("NO");
		no.setBounds(360,280,90,50);
		no.setBackground(Color.GRAY);
		no.setForeground(Color.CYAN);
		no.addMouseListener(this);
		no.addActionListener(this);
		panel0.add(no);
		
		img0=new ImageIcon("01.jpg");
		imgLabel0=new JLabel(img0);
		imgLabel0.setBounds(0,0,700,720);
		panel0.add(imgLabel0);
		
		this.add(panel0);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		
		l1=new JLabel("You are a fool");
		l1.setBounds(155,215,350,30);
		l1.setFont(new Font("Felix Titling",Font.ITALIC,30));
		l1.setForeground(Color.WHITE);
		l1.setOpaque(false);
		panel1.add(l1);
	
		l2=new JLabel("congratulations!!You are not a fool");
		l2.setBounds(155,215,450,30);
		l2.setFont(new Font("Felix Titling",Font.ITALIC,20));
		l2.setForeground(Color.WHITE);
		l2.setOpaque(false);
		panel2.add(l2);
		
		
		
		replay=new JButton("Replay");
		replay.setBounds(160,250,150,50);
		replay.setBackground(Color.GRAY);
		replay.setForeground(Color.CYAN);
		replay.addActionListener(this);
		panel2.add(replay);
		
		
		tryagain=new JButton("Try Again");
		tryagain.setBounds(160,280,150,50);
		tryagain.setBackground(Color.GRAY);
		tryagain.setForeground(Color.CYAN);
		tryagain.addActionListener(this);
		panel1.add(tryagain);

		
		exit=new JButton("Exit");
		exit.setBounds(400,280,70,50);
		exit.setBackground(Color.GRAY);
		exit.setForeground(Color.CYAN);
		exit.addActionListener(this);
		panel1.add(exit);
		
		exit2=new JButton("Exit");
		exit2.setBounds(400,250,70,50);
		exit2.setBackground(Color.GRAY);
		exit2.setForeground(Color.CYAN);
		exit2.addActionListener(this);
		panel2.add(exit2);
		
		img3=new ImageIcon("g.gif");
		imgLabel3=new JLabel(img3);
		imgLabel3.setBounds(250,0,200,200);
		panel2.add(imgLabel3);
		
		img4=new ImageIcon("01.jpg");
		imgLabel4=new JLabel(img4);
		imgLabel4.setBounds(0,0,700,720);
		panel2.add(imgLabel4);
		
		img2=new ImageIcon("012.gif");
		imgLabel2=new JLabel(img2);
		imgLabel2.setBounds(250,0,200,200);
		panel1.add(imgLabel2);
		
		img=new ImageIcon("01.jpg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(0,0,700,720);
		panel1.add(imgLabel);
		
		
	}
	
	public void mouseEntered(MouseEvent e)
	{
		if(e.getSource().equals(no))
		{
			int x,y;
			Random r1 = new Random();
			Random r2=new Random();
			x=r1.nextInt(630);
			if(x==120){x=x-70;}
			else if(x==520){x=x+70;}
			y=r2.nextInt(650);
			if(y==70){y=y-50;}
			else if(y==120){y=y+50;}
			no.setBounds(x,y,90,50);
			
		}
	}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String text=ae.getActionCommand();
		if(text.equals(yes.getText()))
		{
			panel0.setVisible(false);
			this.add(panel1);
			panel1.setVisible(true);
			panel2.setVisible(false);
		}
		else if(text.equals(no.getText()))
		{
			
			panel0.setVisible(false);
			this.add(panel2);
			panel1.setVisible(false);
			panel2.setVisible(true);
		}
		
		else if(text.equals(tryagain.getText()))
		{
			yes.setBounds(160,280,90,50);
			no.setBounds(360,280,90,50);
			
			panel0.setVisible(true);
			panel1.setVisible(false);
			panel2.setVisible(false);
		}
		else if(text.equals(replay.getText()))
		{
			yes.setBounds(160,280,90,50);
			no.setBounds(360,280,90,50);
			
			panel0.setVisible(true);
			panel1.setVisible(false);
			panel2.setVisible(false);
		}
		else if(text.equals(exit.getText()))
		{System.exit(0);}
	}
	
}