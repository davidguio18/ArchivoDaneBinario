package GUI;

import java.awt.Color;
import java.awt.Graphics;

import Model.Area;
import Model.Figure;

/**
 *
 * @author David guio
 */
public class FigureGUIGroup {

    private FigureGUI[] figuresGUI;
    
    public FigureGUIGroup(Figure[] figuresGUI,RandomColor randomColor) {
        super();
        this.figuresGUI = new FigureGUI[figuresGUI.length];
        for (int i = 0; i < figuresGUI.length; i++) {
        	this.figuresGUI[i] = new FigureGUI(figuresGUI[i], randomColor.next()); //colorRandom()); 
        }
    }

    public void add(Figure figure) {
    	
    }

    public Color colorRandom(){
    	return new Color((int) (Math.random()*1000000));
    }
    
    public void init() {
        for (int i = 0; i < figuresGUI.length; i++) {
            this.figuresGUI[i].init();
        }
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        Area area = figuresGUI[0].getArea();
        graphics.drawRect((int)area.getX(), (int) area.getY(), (int) area.getWidth(), (int) area.getHeight());
        for (FigureGUI figuresGUI : figuresGUI) {
            figuresGUI.draw(graphics);
        }
    }
}
