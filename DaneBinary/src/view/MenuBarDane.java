package view;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.Actions;
import controller.Controller;

/**
 * @author David Guio
 */
public class MenuBarDane extends JMenuBar{
	
	private static final long serialVersionUID = 3901929075822219181L;

	public static final String MENU_ARCHIVO = "Archivo";
	public static final String SALIR = "Salir";

	private JMenu menuArchivo;
	
	private JMenuItem menuItemSalir;
	
	public MenuBarDane(Controller controller) {
		this.menuArchivo = new JMenu(MENU_ARCHIVO);
		this.add(menuArchivo);
		
		this.menuItemSalir = new JMenuItem(SALIR);
		this.menuArchivo.add(menuItemSalir);
		this.menuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		menuItemSalir.addActionListener(controller);
		menuItemSalir.setActionCommand(Actions.EXIT.name());
	}
}