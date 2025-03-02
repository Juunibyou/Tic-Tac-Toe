package org.example;

import java.util.Scanner;

public class Turn {

    public boolean PlayerTurn(char[][] board, char player, Scanner scanner, Space space){

        System.out.println("\nPlayer: " + player + "'s Turn. Select a position (1-9)");
        System.out.println("Position: ");
        String input = scanner.nextLine();

        if(!space.isAvailable(board, input)){
            System.out.println("\nPosition have already been taken! Please select another...");
            return false;
        }

        switch(input){
        case "1":
            board[0][0] = player;
            break;
        case "2":
            board[0][1] = player;
            break;
        case "3":
            board[0][2] = player;
            break;

            case "4":
                board[1][0] = player;
                break;
            case "5":
                board[1][1] = player;
                break;
            case "6":
                board[1][2] = player;
                break;

                case "7":
                    board[2][0] = player;
                    break;
                case "8":
                    board[2][1] = player;
                    break;
                case "9":
                    board[2][2] = player;
                    break;
        default:
        System.out.println("\nPlease input a valid value!");
        }

    return true;
    }
}
