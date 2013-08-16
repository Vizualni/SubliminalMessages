

import java.awt.Color;

import javax.swing.JFrame;


public class TransparentWindow extends JFrame{
	

	TransparentPanel panel;;
	public TransparentWindow(){
		super();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new TransparentPanel();
		this.setContentPane(panel);
		setUndecorated(true);
		setBackground(new Color(0,0,0,0));

		setVisible(true);
		setSize(500,50);
		setLocation(500, 500);

		
	}
	
	public boolean displayText(String text){
		if(text.length()>40){
			return false;
		}
		this.panel.setText(text);
		this.panel.refresh();
		setVisible(true);
		
		try{
			Thread.sleep(33);
		}catch(Exception e){
			return false;
		}
		setVisible(false);
		
		return true;
		
	}


}
