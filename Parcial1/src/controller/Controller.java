package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

import view.JFrameMainWindow;

public class Controller implements ActionListener, KeyListener {
	
	private JFrameMainWindow frameMainWindow;
	
	public Controller() {
		frameMainWindow = new JFrameMainWindow(this);
		frameMainWindow.addKeyListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		switch (Actions.valueOf(actionEvent.getActionCommand())) {
		case RESTART:
			frameMainWindow.getPanelMatriz().changeColor();
			 break;
		case EXIT:
			System.exit(0);
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		JLabel label = frameMainWindow.getPanelMatriz().getLabelSimbolo();
		label.setOpaque(true);
		if (keyEvent.getKeyChar() >= 48 && keyEvent.getKeyChar() <= 57 ){
			if (keyEvent.getKeyChar() == label.getName().charAt(0)) {
				label.setBackground(Color.GREEN);
			} else {
				label.setBackground(Color.RED);
			}
		}else {
			label.setBackground(Color.RED);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
