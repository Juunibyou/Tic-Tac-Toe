package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class GamelogTest {

//UPDATE LOG & PRINT SCORE TEST
    Gamelog gamelog = new Gamelog();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @Test
    void testPrint_Xvictory(){
    gamelog.updateLog('X');
    gamelog.updateLog('X');

    System.setOut(new PrintStream(outContent));

    gamelog.printWin();

    System.setOut(originalOut);
    String output = outContent.toString();

    assertTrue(output.contains("Player 'X' wins: 2"));
    assertTrue(output.contains("Player 'O' wins: 0"));
    assertTrue(output.contains("Ties: 0"));
    }


    @Test
    void testPrint_Yvictory(){
    gamelog.updateLog('O');
    gamelog.updateLog('O');
    gamelog.updateLog('O');

    System.setOut(new PrintStream(outContent));

    gamelog.printWin();

    System.setOut(originalOut);
    String output = outContent.toString();

    assertTrue(output.contains("Player 'X' wins: 0"));
    assertTrue(output.contains("Player 'O' wins: 3"));
    assertTrue(output.contains("Ties: 0"));
    }


    @Test
    void testPrint_Tie(){
    gamelog.updateLog('T');

    System.setOut(new PrintStream(outContent));

    gamelog.printWin();

    System.setOut(originalOut);
    String output = outContent.toString();

    assertTrue(output.contains("Player 'X' wins: 0"));
    assertTrue(output.contains("Player 'O' wins: 0"));
    assertTrue(output.contains("Ties: 1"));
    }

//
}



  