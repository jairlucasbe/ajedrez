package com.upgrade.piezas;

public class Torre extends Pieza {

    public Torre(Position position) {
        super("torre", position);
    }

    @Override
    public boolean move(Position position) {
        boolean isValidMovement = true;
        if (super.getPosition().getColumna() != position.getColumna() && super.getPosition().getFila() != position.getFila()) {
            isValidMovement = false;
        }
        return isValidMovement;
    }
}
