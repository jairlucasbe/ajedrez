package com.upgrade.piezas;

public class Position {
	public int fila;
	public char columna;
	
	public Position(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}
}