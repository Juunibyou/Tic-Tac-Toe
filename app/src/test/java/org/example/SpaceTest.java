package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SpaceTest {
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
