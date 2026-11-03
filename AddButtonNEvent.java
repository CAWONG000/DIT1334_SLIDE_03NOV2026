package Slide03NOV;

import javax.swing.*;

public class AddButtonNEvent 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Event Example");
		JButton button = new JButton("Click 我");
		JLabel label = new JLabel("Not clicked yet");
		
		button.addActionListener(e -> label.setText("clicked"));
		
		frame.setLayout(new java.awt.BorderLayout());
		frame.add(button, "South");
		frame.add(label, "Center");
		
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
