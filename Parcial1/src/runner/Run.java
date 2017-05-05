package runner;

import controller.Controller;
import model.OpenForm;
import model.ReadRegister;

public class Run {
	
	public static void main(String[] args) {
		new Controller();
		ReadRegister readRegister = new ReadRegister("src/percistence/persona.txt", OpenForm.READ);
		System.out.println("El numero de mujeres es: " + readRegister.countGenderPerson(2));
	}
}