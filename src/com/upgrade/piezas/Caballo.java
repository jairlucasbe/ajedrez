package com.upgrade.piezas;

public class Caballo extends Pieza {

    public Caballo(Position position) {
        super("caballo", position);
    }

    @Override
    public boolean move(Position position) {
        boolean isValidMovement = false;
        int filaDifference = Math.abs(super.getPosition().getFila() - position.getFila());
        int columnaDifference = Math.abs(super.getPosition().getColumna() - position.getColumna());
        if ((filaDifference == 2 && columnaDifference == 1) || (filaDifference == 1 && columnaDifference == 2)) {
            isValidMovement = true;
        }
        return isValidMovement;
    }
}
