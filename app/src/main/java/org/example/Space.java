package org.example;

public class Space {
    public boolean isAvailable (char[][] board, String position){

        switch(position){
          case "1":
            return (board[0][0] == '1');
          case "2":
            return (board[0][1] == '2');
          case "3":
            return (board[0][2] == '3');
  
              case "4":
                return (board[1][0] == '4');
              case "5":
                return (board[1][1] == '5');
              case "6":
                return (board[1][2] == '6');
  
                case "7":
                    return (board[2][0] == '7');
                case "8":
                    return (board[2][1] == '8');
                case "9":
                    return (board[2][2] == '9');
          default:
            return false;
          }
      }
}