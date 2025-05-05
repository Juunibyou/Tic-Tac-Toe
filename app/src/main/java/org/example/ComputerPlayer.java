package org.example;

import java.util.Random;

public class ComputerPlayer{
    private Random random = new Random();

    public void makeMove(char[][] board, char computer, char player){
        if(isFirstMove(board)){
            cornerMove(board, computer);
            return;
        }
        if (board[1][1] != 'X' && board[1][1] != 'O'){
            board[1][1] = computer;
            return;
        }  
        if (winningMove(board, computer)){
            return;
        }
        if (blockingMove(board, player, computer)){
            return;
        }

        pickRandom(board, computer);
    }



}