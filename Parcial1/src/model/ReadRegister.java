package model;

public class ReadRegister extends FileManager{

	public ReadRegister(String file, OpenForm openForm) {
		super(file,openForm);
		
	}
	
	public int countGenderPerson(int numberPerson){
		this.open();
		if (numberPerson != 0  && numberPerson != 1 && numberPerson != 2) {
			System.out.println(numberPerson);
			return -1;
		}
		int result = 0;
		String line = this.read();
		while ((line = this.read()) != null) {
			if (Integer.parseInt(line.split(",")[5]) == numberPerson){
				result++;
			}
		}
		return result;
	}
}