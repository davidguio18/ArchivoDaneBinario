package test;

import controller.Controller;
import model.GroupPlace;
import persistence.BinaryFileManager;

public class TestBinaryFile {
	
	public static void main(String[] args) {
		GroupPlace groupPlace = new GroupPlace();
		BinaryFileManager binaryFileManager = new BinaryFileManager("src/file/municipios.bin");
		Controller controller = new Controller();
		binaryFileManager.open("rw");
		binaryFileManager.save(controller.getArrayPlace());
		for (int i = 0; i < controller.getArrayPlace().size(); i++) {
			System.out.println(controller.getArrayPlace().get(i).getCityName());
			
		}
		controller.getJframeMainWindow().getTableCity().addListPlace(controller.getArrayPlace());
		binaryFileManager.close();
	}
}