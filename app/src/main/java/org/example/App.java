package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

  char[][] board = {
    {' ',' ',' '},
    {' ',' ',' '}, 
    {' ',' ',' '}
  };

  Board gameboard = new Board();
  Space space = new Space();
  Turn turn = new Turn();
  Gameover gameover = new Gameover();
  Scanner scanner = new Scanner(System.in);

  char currentplayer = 'X';
  boolean finished = false;
  
    while(!finished){
    gameboard.printBoard(board);
    boolean valid = false;

      while(!valid){
        valid = turn.PlayerTurn(board, currentplayer, scanner, space);
      }

      finished = gameover.isGameFinished(board, currentplayer);

      //switch between player
      if (!finished){
        currentplayer = (currentplayer == 'X') ? 'O' : 'X';
      }
    }

    gameboard.printBoard(board);
  }
}

