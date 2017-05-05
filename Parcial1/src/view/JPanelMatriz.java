package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import controller.Controller;

public class JPanelMatriz extends JPanel implements Runnable{

	private static final long serialVersionUID = -5194643827894952594L;

	private JLabel[][] labels;
	public int i;
	public int j;
	private int j2;
	private int k;

	public JPanelMatriz(Controller controller) {
		this.setLayout(new GridLayout(10, 10));
		this.setBackground(Color.CYAN);
		setLabels(new JLabel[10][10]);
		for (int i = 0; i < getLabels().length; i++) {
			for (int j = 0; j < getLabels()[i].length; j++) {
				this.add(getLabels()[i][j] = new JLabel("", JLabel.CENTER));  //agrego el elemento a la matriz
				getLabels()[i][j].setName((int)(Math.random()*10) + "");
				getLabels()[i][j].setBorder(new MatteBorder(3, 3, 3, 3, Color.BLACK));
				getLabels()[i][j].setForeground(Color.RED);
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			sleep(2000);
			i = (int)(Math.random()*10);
			j = (int)(Math.random()*10);
			setJ2((int)(Math.random()*10));
			setK((int)(Math.random()*10));
			getLabels()[i][j].setText(getLabels()[i][j].getName());

			getLabels()[getJ2()][getK()].setText("?");

			sleep(500);
			getLabels()[i][j].setText("");  // despues de medio segundo en la casilla desaparece el numero

			sleep(500);
			getLabels()[getJ2()][getK()].setText("");
		}
	}
	
	public static void sleep(long timeInMillis) {
		try {
			Thread.sleep(timeInMillis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getJ2() {
		return j2;
	}

	public void setJ2(int j2) {
		this.j2 = j2;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	public JLabel getLabelSimbolo() {
		return getLabels()[j2][k];
	}

	public JLabel[][] getLabels() {
		return labels;
	}

	public void setLabels(JLabel[][] labels) {
		this.labels = labels;
	}

	public void changeColor() {
		for (int i = 0; i < labels.length; i++) {
			for (int j = 0; j < labels[i].length; j++) {
				labels[i][j].setBackground(Color.CYAN);
			}
		}
	}

}