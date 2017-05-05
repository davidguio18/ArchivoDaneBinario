package Model;

public class FigureGroup {
	
	private Figure[] figures;

	public Figure[] getFigures() {
		return figures;
	}

	public void setFigures(Figure[] figures) {
		this.figures = figures;
	}
	
	public void colision(){
		for (int i = 0; i < figures.length - 1; i++) {
			for (int j = i + 1; j < figures.length; j++) {
				if (istersection(figures[i], figures[j])) {
					figures[i].setCrash(true);
					figures[j].setCrash(true);
				}
			}
		}
	}
	
	public boolean istersection(Figure figure, Figure figure2){
//		double temp = 0;
//				if (figure.getX()/2 > figure2.getX()/2 && figure.getY()/2 > figure2.getY()/2) {
//					
//				}
//		return hipotenusa < figure.getSize()/2 + figure2.getSize()/2;
		return false;
	}

}
