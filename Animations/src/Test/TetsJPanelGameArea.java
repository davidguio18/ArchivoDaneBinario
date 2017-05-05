package Test;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;

import GUI.FigureGUIGroup;
import GUI.JPanelGameArea;
import GUI.RandomColor;
import Model.Area;
import Model.Coord;
import Model.Figure;

public class TetsJPanelGameArea {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Test game area");
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        // logica ..
        Random random = new Random();
//        FigureGroup[] figureGroups = new FigureGUIGroup(figuresGUI, randomColor)[10];
        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new Figure(random.nextInt(40) + 10, Math.toRadians(random.nextInt(360)),
                    random.nextInt(90) + 20.0, new Coord(random.nextInt(770) + 20.0, random.nextInt(550) + 20));
            figures[i].setArea(new Area(20, 20, 1000, 800));
        }
        // vista 
        Color[] colors = {Color.YELLOW,Color.RED,Color.BLUE,Color.BLACK,Color.GREEN,Color.CYAN,Color.ORANGE,Color.MAGENTA};
        RandomColor randomColor = new RandomColor(colors);
        FigureGUIGroup figureGUI = new FigureGUIGroup(figures,randomColor);
        JPanelGameArea jPanelGameArea = new JPanelGameArea(figureGUI);
        jFrame.add(jPanelGameArea);
        jPanelGameArea.init();
        jFrame.setVisible(true);
    }
}
