package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    boolean playagain = true;
    Scanner scanner = new Scanner(System.in);


    while(playagain){
      System.out.println("\n|_____Welcome to Tic-Tac-Toe Game!_____|\n");

      char[][] board = {
        {'1','2','3'},
        {'4','5','6'}, 
        {'7','8','9'}
      };

      Board gameboard = new Board();
      Space space = new Space();
      Turn turn = new Turn();
      Gameover gameover = new Gameover();

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
    System.out.println("\nWould you like to play again? (Y/N)");

    String again = scanner.nextLine().trim();;

    boolean valid_input = false;
      while(!valid_input){
        if(again.equals("y") || again.equals("Y")){
          playagain = true; 
          valid_input = true;
        }
        else if(again.equals("n") || again.equals("N")){
          playagain = false;
          valid_input = true;
          System.out.println("\nGoodbye!...");
        }
        else{
          System.out.println("\nPlease enter a valid input...");
          System.out.println("Would you like to play again? (Y/N)");
          valid_input = false; 
          again = scanner.nextLine().trim();
        }
      }
    }
  }
}