package Test;

import java.awt.Color;

import GUI.RandomColor;

public class TestRandomColor {

	public static void main(String[] args) {
		Color[] colors = {Color.YELLOW,Color.RED,Color.BLUE,Color.BLACK,Color.GREEN,Color.CYAN,Color.ORANGE,Color.MAGENTA};
		RandomColor randomColor = new RandomColor(colors);
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + randomColor.next() );
		}
	}
}
