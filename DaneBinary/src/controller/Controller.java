package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Place;
import persistence.FileManager;
import view.JFrameMainWindow;

public class Controller implements  ActionListener {
	
	private FileManager fileManager;
	private JFrameMainWindow jframeMainWindow;
	private ArrayList<Place> arrayPlace;
	
	public Controller() {
		arrayPlace = new  ArrayList<>();
		fileManager = new FileManager();
		jframeMainWindow = new JFrameMainWindow(this);
		initApp();
		jframeMainWindow.setVisible(true);
	}

	private void initApp() {
		try {
			this.manageString(fileManager.readFile());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No se puede leer el archivo");
		}
	}
	
	public void manageString(List<String> listLines){
		for (int i = 0; i < listLines.size(); i++) {
			String [] vector = listLines.get(i).split(";");
			Place place = createPlace(vector);
			jframeMainWindow.getTableCity().addplace(place);
			//groupPlace.add(place);
			arrayPlace.add(place);
		}
	}
	
	public ArrayList<Place> getArrayPlace() {
		return arrayPlace;
	}

	public void setArrayPlace(ArrayList<Place> arrayPlace) {
		this.arrayPlace = arrayPlace;
	}

	private Place createPlace(String[] vector) {
		return new Place(vector[0], vector[1], (vector[2]), vector[3]);
	}

	public JFrameMainWindow getJframeMainWindow() {
		return jframeMainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Actions.valueOf(e.getActionCommand())) {
		case EXIT:
			System.exit(0);
			break;
		}
		
	}	
}