package test;

import model.OpenForm;
import model.ReadRegister;

public class TestReadRegister {

	
	public static void main(String[] args) {
		ReadRegister readRegister = new ReadRegister("src/percistence/persona.txt", OpenForm.READ);
		System.out.println(readRegister.countGenderPerson(2) +readRegister.countGenderPerson(1) + readRegister.countGenderPerson(0));
	}

}
