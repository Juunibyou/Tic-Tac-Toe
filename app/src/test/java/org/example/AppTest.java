package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  
  @Test
    public void testplayerXwinhorizontal(){
      char[][] board = {
        {'X', 'X', 'X'},
        {'4', '5', '6'},
        {'7', '8', '9'}
      };
  
    Gameover gameover = new Gameover();
    assertTrue(gameover.isGameFinished(board, 'X'));
    }

    @Test
    public void testplayerXwinvertical(){
      char[][] board = {
        {'X', '2', '3'},
        {'4', 'X', '6'},
        {'7', '8', 'X'}
      };

    Gameover gameover = new Gameover();
    assertTrue(gameover.isGameFinished(board, 'X'));
    }

    @Test
    public void testplayerOwinhorizontal(){
      char[][] board = {
        {'O', 'O', 'O'},
        {'4', '5', '6'},
        {'7', '8', '9'}
      };
  
    Gameover gameover = new Gameover();
    assertTrue(gameover.isGameFinished(board, 'O'));
    }

    @Test
    public void testplayerOhorizontal(){
      char[][] board = {
        {'O', '2', '3'},
        {'4', 'O', '6'},
        {'7', '8', 'O'}
      };

    Gameover gameover = new Gameover();
    assertTrue(gameover.isGameFinished(board, 'O'));
    }

    @Test
    public void testPosition() {
    char[][] board = {
        {'X', 'O', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    Space space = new Space();
    boolean isAvailable = space.isAvailable(board, "1"); 
    assertFalse(isAvailable);
    }

    @Test
    public void testValid() {
    char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    Space space = new Space();
    boolean isAvailable = space.isAvailable(board, "-1"); 
    assertFalse(isAvailable);
    }
}

