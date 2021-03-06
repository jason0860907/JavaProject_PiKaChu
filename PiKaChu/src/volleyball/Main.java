package volleyball;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
//import java.util.Timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.math.*;

public class Main extends JFrame implements ActionListener, KeyListener{

	JLabel background = new JLabel(new ImageIcon("src/image/background2.png"));
	public boolean  enter; 
	StartScreen start;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main volleyball_frame = new Main();
		volleyball_frame.setVisible(true);
	}
	
	public Main() {
		setSize(1000, 540);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		requestFocusInWindow();
		
		start = new StartScreen(this,1000,500);
		start.check_type();	
		
	}
	

	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (start.choose==start.PLAYER1) {
				
				start.stop();

				background.setSize(1000, 500);
				background.setLocation(0, 0);
				background.setVisible(true);
				add(background);
			}
			else if (start.choose==start.PLAYER2) {
				
				start.stop();
				
				Game2PMode game2P = new Game2PMode(this, 1000, 500);
				game2P.start();

				background.setSize(1000, 500);
				background.setLocation(0, 0);
				background.setVisible(true);
				add(background);
			}
			
			else if (start.choose==start.PLAYER3) {
				
				
			}
			
			
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
