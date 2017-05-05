package GUI;

import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGameArea extends JPanel implements Runnable {

	private static final long serialVersionUID = 8175831945312050340L;
	
	public static final int REFREST_TIME = 100;
    
	private FigureGUIGroup figureGUI;

    public JPanelGameArea(FigureGUIGroup figureGUI) {
        super();
        this.figureGUI = figureGUI;
    }

    public void init() {
        new Thread(this).start();
        this.figureGUI.init();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.figureGUI.draw(graphics);
    }
    
//    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(REFREST_TIME);
            } catch (InterruptedException ex) {
            }
        }
    }
}
