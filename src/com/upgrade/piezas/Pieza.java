package com.upgrade.piezas;

public abstract class Pieza {
	private String name;
	private Position position;
	
	public Pieza(String name, Position position) {
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return this.position;
	}
	
	public abstract boolean move(Position position);
	
}