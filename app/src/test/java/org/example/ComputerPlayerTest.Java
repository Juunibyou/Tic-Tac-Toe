package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComputerPlayerTest {

    @Test
    public void testcornerMove(){
        ComputerPlayer computerplayer = new ComputerPlayer();
        char[][] board = {
            {'1','2','3'},
            {'4','5','6'}, 
            {'7','8','9'}
        };

        computerplayer.makeMove(board, 'O', 'X');

        boolean corner = board[0][0] == 'O' || board[0][2] == 'O' || board[2][0] == 'O' || board[2][2] == 'O';
        assertTrue(corner);
    }

    @Test
    public void testblockMove() {
        ComputerPlayer computerplayer = new ComputerPlayer();
        char[][] board = {
            {'X', 'X', '3'},
            {'4', 'O', '6'},
            {'7', '8', '9'}
        };

        computerplayer.makeMove(board, 'O', 'X');
        assertEquals('O', board[0][2]);
    }

    @Test
    public void testComputerWinningMove() {
        ComputerPlayer computerplayer = new ComputerPlayer();
        char[][] board = {
            {'O', 'O', '3'},
            {'4', 'X', '6'},
            {'7', '8', '9'}
        };

        computerplayer.makeMove(board, 'O', 'X');
        assertEquals('O', board[0][2]);
    }

}

