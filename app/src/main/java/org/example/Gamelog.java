package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gamelog {
    
    private int Xwin = 0;
    private int Owin = 0;
    private int ties = 0;

    public void updateLog(char winner){
        if (winner == 'X'){Xwin++;}
        else if (winner == 'O'){Owin++;}
        else{ties++;}
    }

    public void printWin() {
        System.out.println("\n<<<Game Statistics>>>");
        System.out.println("Player 'X' wins: " + Xwin);
        System.out.println("Player 'O' wins: " + Owin);
        System.out.println("Ties: " + ties + "\n");
    }

    public void saveLog() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("gamelog.txt"))) {
            writer.write("\n<<<Game Statistics>>>");
            writer.write("Player 'X' wins: " + Xwin);
            writer.write("Player 'O' wins: " + Owin);
            writer.write("Ties: " + ties + "\n");
        } 
        catch (IOException error) {
            System.out.println("Error has occurred while saving log...\n");
        }
    }

}


