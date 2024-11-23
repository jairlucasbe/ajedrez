package com.upgrade;

import com.upgrade.piezas.Pieza;
import com.upgrade.piezas.Position;

public class Board {
    
    private Pieza[][] board;

    public Board() {
        this.board = new Pieza[8][8];
    }

    public void drawBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                Pieza pieza = this.board[i][j];
                System.out.print((pieza == null ? "[_]" : pieza.getName()) + "\t");
            }
            System.out.println();
        }
    }

    public void poner(Pieza pieza, Position position) {
        int[] coordenada = getCoordenada(position);
        int fila = coordenada[0];
        int columna = coordenada[1];
        this.board[fila][columna] = pieza;
    }

    public int[] getCoordenada(Position position) {
        int[] coordenada = new int[2];
        coordenada[0] = 8 - position.getFila();
        coordenada[1] = position.getColumna() - 'a';
        return coordenada;
    }

    public void sacar(Position position) {
        int[] coordenada = getCoordenada(position);
        int fila = coordenada[0];
        int columna = coordenada[1];
        this.board[fila][columna] = null;
    }

    public Pieza getPieza(Position position) {
        int[] coordenada = getCoordenada(position);
        int fila = coordenada[0];
        int columna = coordenada[1];
        return this.board[fila][columna];
    }
}
