package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{
	
	JMenuBar mb;
	JMenu m1, m2;
	JMenuItem i1,i2,i3,i4;
	
	Dashboard(){
		
		mb = new JMenuBar();
		add(mb);
		
		m1 = new JMenu("HOTEL MANAGEMENT");
		m1.setForeground(Color.RED);
		mb.add(m1);
		
		m2 = new JMenu("ADMIN");
		m2.setForeground(Color.BLUE);
		mb.add(m2);

		i1 = new JMenuItem("Reception");
		m1.add(i1);
		
		i2 = new JMenuItem("Add Employee");
		m2.add(i2);
		
		i3 = new JMenuItem("Add Rooms");
		m2.add(i3);
		
		i4 = new JMenuItem("Add Drivers");
		m2.add(i4);
		
		mb.setBounds(0,0,1920,20);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(0,0,1920,1080);
		add(l1);
		
		JLabel l2 = new JLabel("Welcome to the Hotel Management System");
		l2.setBounds(300,60,1000,60);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		l1.add(l2);
		
		setLayout(null);
		setBounds(0,0,1920,1080);
		setVisible(true);

	}
	
	public static void main(String[] args)
	{
		new Dashboard().setVisible(true);
	}
}
