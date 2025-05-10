package org.example;

public class Board {
    public void printBoard(char[][] board) {

        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }

    public String stringBoard(char[][] board) {
        return board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n" +
               "-+-+-\n" +
               board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n" +
               "-+-+-\n" +
               board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n";
    }
}

