package GUI;

import Model.Coord;
import Model.Figure;
import java.awt.Color;
import java.awt.Graphics;

public class FigureGUI extends Figure {

	private Color color;
	
    public FigureGUI(Figure figure, Color color) {
        super(figure.getSize(), figure.getDirection(), figure.getSpeed(),
                new Coord(figure.getX(), figure.getY()));
        this.color = color;
        this.setArea(figure.getArea());
    }

    public void init() {
        this.setMoving(true);
        new Thread(this).start();
    }

    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval((int) this.getX(), (int) this.getY(), this.getSize(), this.getSize());
    }

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
      
    
    
}
