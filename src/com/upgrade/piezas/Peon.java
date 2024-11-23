package com.upgrade.piezas;

public class Peon extends Pieza{

	public Peon(Position position) {
		super("peon", position);
	}

	@Override
	public boolean move(Position position) {
		boolean isValidMovement = true;
		if(super.getPosition().getColumna()!=position.getColumna()) {
			isValidMovement = false;
		}else {
			if(super.getPosition().getFila()==2) {
				if(position.getFila()-super.getPosition().getFila()>2 || position.getFila()-super.getPosition().getFila()<0) {
					isValidMovement = false;
				}
			}else {
				if(position.getFila()-super.getPosition().getFila()!=1) {
					isValidMovement = false;
				}
			}
		}
		return isValidMovement;
	}
}