package com.upgrade;

import com.upgrade.piezas.Pieza;
import com.upgrade.piezas.Peon;
import com.upgrade.piezas.Torre;
import com.upgrade.piezas.Alfil;
import com.upgrade.piezas.Caballo;
import com.upgrade.piezas.Dama;
import com.upgrade.piezas.Rey;
import com.upgrade.piezas.Position;

public class GameMaster {

    private Board board;

    public GameMaster() {
        board = new Board();
        iniciarJuego();
    }

    public void iniciarJuego() {
        for (char columna = 'a'; columna <= 'h'; columna++) {
            Position position = new Position(2, columna);
            board.poner(new Peon(position), position);
        }
        board.poner(new Torre(new Position(1, 'a')), new Position(1, 'a'));
        board.poner(new Torre(new Position(1, 'h')), new Position(1, 'h'));
        board.poner(new Caballo(new Position(1, 'b')), new Position(1, 'b'));
        board.poner(new Caballo(new Position(1, 'g')), new Position(1, 'g'));
        board.poner(new Alfil(new Position(1, 'c')), new Position(1, 'c'));
        board.poner(new Alfil(new Position(1, 'f')), new Position(1, 'f'));
        board.poner(new Dama(new Position(1, 'd')), new Position(1, 'd'));
        board.poner(new Rey(new Position(1, 'e')), new Position(1, 'e'));
        board.drawBoard();
    }

    public void mover(Position origen, Position destino) {
        Pieza pieza = board.getPieza(origen);
        if (pieza != null) {
            if (!verificarDestinoOcupado(destino)) {
                if (pieza.move(destino)) {
                    board.sacar(origen);
                    board.poner(pieza, destino);
                    System.out.println("Movimiento válido.");
                } else {
                    System.out.println("Movimiento inválido.");
                }
            }
        } else {
            System.out.println("No hay pieza en la posición de origen.");
        }
        board.drawBoard();
    }

    public boolean verificarDestinoOcupado(Position destino) {
        Pieza piezaDestino = board.getPieza(destino);
        if (piezaDestino != null) {
            System.out.println("Movimiento inválido: Ya hay una pieza en " + destino + ".");
            return true;
        }
        return false;
    }
}
