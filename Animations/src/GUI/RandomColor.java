package GUI;

import java.awt.Color;
import java.util.Random;

public class RandomColor {
	
	public Color[] colors;
	Random random;
	
	public RandomColor(Color[] colors) {
		this.colors = colors;
		random = new Random();
	}
	
	public Color next(){
		return colors[random.nextInt(colors.length)];
	}

}
