package view;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import controller.Actions;
import controller.Controller;

public class JPopupMenuEmergente extends JPopupMenu{

	private static final String REINICIAR = "Reiniciar";
	private static final String SALIR = "Salir";

	private static final long serialVersionUID = 1L;
	
	private JMenuItem restart;
	private JMenuItem exit;
	
	public JPopupMenuEmergente(Controller controller) {
		restart = new JMenuItem(REINICIAR);
		restart.setActionCommand(Actions.RESTART.name());
		this.add(restart);
		restart.addActionListener(controller);
		
		exit = new JMenuItem(SALIR);
		this.addSeparator();
		exit.setActionCommand(Actions.EXIT.name());
		this.add(exit);
		exit.addActionListener(controller);
	}
}
