package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    public void testPrintBoard() {
        Board board = new Board();
        char[][] testBoard = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };

        String expected =
            "1|2|3\n" +
            "-+-+-\n" +
            "4|5|6\n" +
            "-+-+-\n" +
            "7|8|9\n";

        assertEquals(expected, board.stringBoard(testBoard));
    }
}




