package org.example;

public class Gameover {

//Winning conditions
boolean CheckWinner(char[][] board, char player){

    return 
       (board[0][0] == player && board[0][1] == player && board[0][2] == player) || 
       (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
       (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||

       (board[0][0] == player && board[1][0] == player && board[2][0] == player) || 
       (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
       (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||

       (board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
       (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

//Tie conditions
boolean BoardisFull(char[][] board){
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j <board[i].length; j++){
            if(board[i][j] != 'X' && board[i][j] != 'O'){
                return false;
            }
        }
    }
    return true;
}

boolean isGameFinished(char[][] board, char currentplayer){

    if(CheckWinner(board, currentplayer)){
        System.out.println("\nPlayer: " + currentplayer + " wins!");
        return true;
    }
    else if (BoardisFull(board)){
        System.out.println("\nThe game has ended in a tie!");
        return true;
    }
    return false;
}
   
}