package com.vizualni;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


public class TransparentPanel extends JPanel{
	
	String text;
	Font font;
	Color color;
	private TransparentWindow parent;
	private boolean clear;
	public TransparentPanel(TransparentWindow transparentWindow){
		//super();
		setOpaque(true);
		parent = transparentWindow;
		this.text = "You are preety";
		font = new Font("Arial",Font.BOLD, 33);
		color = new Color(0,0,0,255);
		this.clear = true;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void clear(){
		this.clear=true;
		repaint();
	}
	
	public void refresh(){
		this.clear = false;
		repaint();
		

	}
	
	@Override
    protected void paintComponent(Graphics g) {
		
		
		if(this.clear){
			g.setColor(new java.awt.Color(0, 0, 0, 0));
			g.fillRect(0, 0, getWidth(), getHeight());
		}else{
			
        	g.setFont(font);
        	g.setColor(color);
        	g.drawString(this.text, 30, 30);
		}
		 
		super.paintComponent(g);
    }

}
