package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
	public void getDetails() {
		System.out.println(this.name + " " + this.surname + " with specializatios: " + this.specialization);
	}
}
