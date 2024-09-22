package org.example;

import java.util.Scanner;

public class BattleShipGame {
    private char[][] playerboard = new char[10][10];
    private char[][] enemyboard = new char[10][10];
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BattleShipGame game = new BattleShipGame();
        game.placeShip();
        game.taketurn();
    }

    public BattleShipGame() {
        initializeboard(playerboard);
        initializeboard(enemyboard);
    }

    public void initializeboard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '*';
            }
        }
    }

    public void printboard(char[][] board) {
        System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.println(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeShip() {
        System.out.println("Please place the ship : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        playerboard[x][y] = 'A';
        System.out.println("Ship placed");
    }

    public void taketurn() {
        System.out.println("Show enemyboard");
        printboard(enemyboard);
        System.out.println("Please enter the coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (enemyboard[x][y] == 'A') {
            System.out.println("You hit the ship");
            enemyboard[x][y] = 'X';
        }else {
            System.out.println("You did not hit the ship");
            enemyboard[x][y] ='O';
        }

    }
}
