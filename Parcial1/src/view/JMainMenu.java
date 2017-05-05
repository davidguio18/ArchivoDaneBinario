package view;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.Actions;
import controller.Controller;

public class JMainMenu extends JMenuBar{

	/**
	 * @author David guio
	 */

	private static final long serialVersionUID = 1L;
	private static final String MENU = "Archivo";
	private static final String REINICIAR = "Reiniciar";
	private static final String SALIR = "Salir";
	
	private JMenu menu;
	private JMenuItem menuItemRestart;
	private JMenuItem menuItemExit;
	
	public JMainMenu(Controller controller) {
		init(controller);
	}

	public void init(Controller controller){
		menu = new JMenu(MENU);
		menuItemRestart = new JMenuItem(REINICIAR);
		menuItemExit = new JMenuItem(SALIR);
		
		this.add(menu);
		menu.add(menuItemRestart);
		this.menuItemRestart.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		menuItemRestart.setActionCommand(Actions.RESTART.name());
		menuItemRestart.addActionListener(controller);
		
		menu.add(menuItemExit);
		this.menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuItemExit.setActionCommand(Actions.EXIT.name());
		menuItemExit.addActionListener(controller);
	}
}
