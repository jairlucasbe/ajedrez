package com.upgrade.piezas;

public class Dama extends Pieza {

    public Dama(Position position) {
        super("dama", position);
    }

    @Override
    public boolean move(Position position) {
        boolean isValidMovement = false;
        if (super.getPosition().getFila() == position.getFila() || super.getPosition().getColumna() == position.getColumna()) {
            isValidMovement = true;
        }
        else if (Math.abs(super.getPosition().getFila() - position.getFila()) == Math.abs(super.getPosition().getColumna() - position.getColumna())) {
            isValidMovement = true;
        }
        return isValidMovement;
    }
}
