package com.upgrade;

import com.upgrade.piezas.Position;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameMaster gameMaster = new GameMaster();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.println();
            System.out.print("*****Ingrese el movimiento (pieza origen destino): ");
            String input = scanner.nextLine();
            String[] partes = input.split(" ");
            if (partes.length != 3) {
                System.out.println("Entrada inválida");
                continue;
            }
            String tipoPieza = partes[0].toLowerCase();
            String origenStr = partes[1];
            String destinoStr = partes[2];
            Position origen = parsePosition(origenStr);
            Position destino = parsePosition(destinoStr);
            gameMaster.mover(origen, destino);
        }
    }

    public static Position parsePosition(String positionStr) {
        char columna = positionStr.charAt(0);
        int fila = Character.getNumericValue(positionStr.charAt(1));
        return new Position(fila, columna);
    }
}
