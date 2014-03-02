package com.vizualni;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TransparentWindow extends JFrame {

	TransparentPanel panel;
	int show_time;

	public TransparentWindow() {
		super();
		super.setAlwaysOnTop(true);
		setOpacity(1);
		show_time = 50;
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new TransparentPanel(this);
		this.setContentPane(panel);
		setUndecorated(true);
		setBackground(new Color(0, 0, 0, 0));

		setVisible(true);
		setSize(500, 50);
		setLocationRelativeTo(null);

	}

	public boolean displayText(String text) {
		if (text.length() > 40) {
			return false;
		}
		this.panel.setText(text);

		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				setVisible(true);
				panel.refresh();
			}
		});

		try {
			Thread.sleep(show_time);
		} catch (Exception e) {
			return false;
		}
		
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				setVisible(false);
				panel.clear();
			}
		});
		

		return true;

	}

}
