package Slide03NOV;

import java.awt.*;//colir
import javax.swing.*;

public class GuiNThreats 
{
	public static void main(String[] args) 
	{
		JFrame window = new JFrame("Loading Example");
		JProgressBar bar = new JProgressBar(0, 100);
		window.add(bar);
		window.setSize(1000, 100);
		window.setVisible(true);
		
		Thread t = new Thread(() ->{
			for (int i=0; i<=100; i++) {
				
				bar.setForeground(Color.BLACK);//set color to black 
				bar.setValue(i);
				
				try 
				{
					Thread.sleep(10);
					
				}
				catch (InterruptedException e) {}
			}
		}); 
		t.start();
	}
}
