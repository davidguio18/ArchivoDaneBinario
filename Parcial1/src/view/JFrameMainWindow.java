package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;

public class JFrameMainWindow extends JFrame{

	/**
	 * @author david guio
	 */
	private static final long serialVersionUID = 1L;
	private static final String TITTLE = "Parcial";
	public static final int WIDTH_APP = 800;
	public static final int HEIGHT_APP = 800;
	
	private JMainMenu mainMenu;
	private JPopupMenuEmergente popupMenuEmergente;
	private JPanelMatriz panelMatriz;
	
	public JFrameMainWindow(Controller controller) {
		this.setSize(WIDTH_APP,HEIGHT_APP);
		this.setTitle(TITTLE);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainMenu = new JMainMenu(controller);
		this.setJMenuBar(mainMenu);

		popupMenuEmergente = new JPopupMenuEmergente(controller);
		((JPanel)this.getContentPane()).setComponentPopupMenu(popupMenuEmergente); 
		
		panelMatriz = new JPanelMatriz(controller);
		this.add(panelMatriz);
		
		this.setVisible(true);
		
		new Thread(panelMatriz).start();
	}
	
	public JPanelMatriz getPanelMatriz(){
		return panelMatriz;
	}
}