package com.upgrade.piezas;

public class Alfil extends Pieza {

    public Alfil(Position position) {
        super("alfil", position);
    }

    @Override
    public boolean move(Position position) {
        boolean isValidMovement = false;
        if (Math.abs(super.getPosition().getFila() - position.getFila()) == Math.abs(super.getPosition().getColumna() - position.getColumna())) {
            isValidMovement = true;
        }
        return isValidMovement;
    }
}
