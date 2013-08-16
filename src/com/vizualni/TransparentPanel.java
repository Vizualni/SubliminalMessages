package com.vizualni;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class TransparentPanel extends JPanel{
	
	String text;
	public TransparentPanel(){
		//super();
		setOpaque(false);
		this.text = "You are preety1231231231231231";
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void refresh(){
		repaint();
	}
	@Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g); 

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.85f));
        //g2d.setColor(getBackground());
        //g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setFont(new Font("Arial",Font.BOLD, 33));
        g2d.setColor(new Color(0,0,0,255));
        g2d.drawString(this.text, 30, 30);
        

    }

}
