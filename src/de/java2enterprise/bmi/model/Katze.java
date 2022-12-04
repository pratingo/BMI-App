package de.java2enterprise.bmi.model;

public class Katze extends Lebewesen {
	
	public void isst() {
		super.setGewicht(super.getGewicht() + 1);
	}
	
	public void spielt() {
		super.setGewicht(getGewicht() - 0.1);
	}
	
}
