package com.vizualni;


import java.awt.Color;

import javax.swing.JFrame;


public class TransparentWindow extends JFrame{
	

	TransparentPanel panel;
	int show_time;
	public TransparentWindow(){
		super();
		super.setAlwaysOnTop(true);
		show_time = 33;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new TransparentPanel();
		this.setContentPane(panel);
		setUndecorated(true);
		setBackground(new Color(0,0,0,0));

		setVisible(true);
		setSize(500,50);
		setLocationRelativeTo(null);

		
	}
	
	public boolean displayText(String text){
		if(text.length()>40){
			return false;
		}
		this.panel.setText(text);
		this.panel.refresh();
		
		try{
			Thread.sleep(show_time);
		}catch(Exception e){
			return false;
		}
		this.panel.clear();

		
		return true;
		
	}


}
