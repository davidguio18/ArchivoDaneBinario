package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;

import controller.Controller;

/**
 * @author David Guio
 */
public class JFrameMainWindow extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	public static final String CODIGOS = "Codigos";
	public static final int APP_WIDTH = 600;
	public static final int APP_HEIGHT = 600;
	
	private MenuBarDane menuBarDane;
	private TableCity tableCity;

	public JFrameMainWindow(Controller controller) {
		this.setTitle(CODIGOS);
		this.setSize(APP_WIDTH, APP_HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		menuBarDane = new MenuBarDane(controller);
		this.setJMenuBar(menuBarDane);
		
		tableCity = new TableCity();
		this.add(tableCity);
		
	}

	public MenuBarDane getMenuBarDane() {
		return menuBarDane;
	}

	public void setMenuBarDane(MenuBarDane menuBarDane) {
		this.menuBarDane = menuBarDane;
	}

	public TableCity getTableCity() {
		return tableCity;
	}

	public void setTableCity(TableCity tableCity) {
		this.tableCity = tableCity;
	}	
}