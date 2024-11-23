package com.upgrade.piezas;

public class Rey extends Pieza {

    public Rey(Position position) {
        super("rey", position);
    }

    @Override
    public boolean move(Position position) {
        boolean isValidMovement = false;
        int filaDiff = Math.abs(super.getPosition().getFila() - position.getFila());
        int columnaDiff = Math.abs(super.getPosition().getColumna() - position.getColumna());
        if (filaDiff <= 1 && columnaDiff <= 1) {
            isValidMovement = true;
        }
        return isValidMovement;
    }
}
