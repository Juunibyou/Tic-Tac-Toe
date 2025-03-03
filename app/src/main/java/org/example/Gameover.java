package org.example;

public class Gameover {
    boolean isGameFinished(char[][] board, char player){

//Winning conditions
    if((board[0][0] == player && board[0][1] == player && board[0][2] == player) || 
       (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
       (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||

       (board[0][0] == player && board[1][0] == player && board[2][0] == player) || 
       (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
       (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||

       (board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
       (board[0][2] == player && board[1][1] == player && board[2][0] == player)){
        System.out.println("\nPlayer: " + player + " wins!");
        return true;
    }

//Tie conditions
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j <board[i].length; j++){
            if(board[i][j] != 'X' && board[i][j] != 'O'){
                return false;
            }
        }
    }

    System.out.println("\nThe game has ended in a tie!");
    return true;
    }
}
