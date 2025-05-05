package org.example;

import java.util.Random;

public class ComputerPlayer{
    private Random random = new Random();

    public void makeMove(char[][] board, char computer, char player){
        if(FirstMove(board)){
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

    private boolean FirstMove(char[][] board){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(board[row][col] == 'X' || board[row][col] == 'O'){
                    return false;
                }
            }
        }
        return true;
    }

    private void cornerMove(char[][] board, char symbol){
        int[][] corner = {{0, 0}, {0, 2}, {2, 0}, {2, 2}};

        for(int i = 0; i < corner.length; i++){
            int row = corner[i][0];
            int col = corner[i][1];
            if (board[row][col] != 'X' && board[row][col] != 'O'){
                board[row][col] = symbol;
                return;
            }
        }
    }

    private boolean winningMove(char[][] board, char symbol){
        return completeWin(board, symbol, symbol);
    }

    private boolean blockingMove(char[][] board, char player, char computer){
        return completeWin(board, player, computer);
    }

    private boolean completeWin(char[][] board, char check, char place){
        Gameover gameover = new Gameover();

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(board[row][col] == 'X' || board[row][col] == 'O'){
                    continue;
                }

                char old = board[row][col];
                board[row][col] = check;

                if(gameover.CheckWinner(board, check)){
                    board[row][col] = check;
                    return true;
                }

                board[row][col] = old;
            }
        }

        return false;
    }

    private void pickRandom(char[][] board, char symbol){
        int[][] openSpace = new int [9][2];
        int count = 0;

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(board[row][col] != 'X' && board[row][col] != 'O'){
                    openSpace[count][0] = row;
                    openSpace[count][1] =col;
                    count++;
                }
            }
        }

        if (count > 0){
            int pick = random.nextInt(count);
            int row = openSpace[pick][0];
            int col = openSpace[pick][1];
            board[row][col] = symbol;
        }
    }


}