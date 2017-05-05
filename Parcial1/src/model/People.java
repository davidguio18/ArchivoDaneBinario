package model;

import java.time.LocalDate;

public class People {
	
	private int id;
	private LocalDate Register;
	private int idLegal;
	private String nombre;
	private String apellido;
	private Gender genero;
	private LocalDate nacimiento;
	private int status;
	private int parent;
	
	public People(int id, LocalDate register, int idLegal, String nombre, String apellido, Gender genero,
			LocalDate nacimiento, int status, int parent) {
		super();
		this.id = id;
		Register = register;
		this.idLegal = idLegal;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.nacimiento = nacimiento;
		this.status = status;
		this.parent = parent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getRegister() {
		return Register;
	}

	public void setRegister(LocalDate register) {
		Register = register;
	}

	public int getIdLegal() {
		return idLegal;
	}

	public void setIdLegal(int idLegal) {
		this.idLegal = idLegal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Gender getGenero() {
		return genero;
	}

	public void setGenero(Gender genero) {
		this.genero = genero;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public String toStringFormat() {
		String line = (this.id + "," + this.Register + "," + this.idLegal + "," + this.nombre + "," + this.apellido
				+ "," + this.genero + "," + this.nacimiento + "," + this.status + "," + this.parent);
		return line;
	}
}
