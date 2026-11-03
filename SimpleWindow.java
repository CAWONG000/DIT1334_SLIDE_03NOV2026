package Slide03NOV;

import javax.swing.*;

public class SimpleWindow
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("MY GUI APP");
		
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello, Java Gui!", SwingConstants.CENTER);
		
		frame.add(label);
		frame.setVisible(true);
	}
}
