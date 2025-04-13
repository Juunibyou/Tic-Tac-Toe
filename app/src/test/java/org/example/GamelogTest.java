package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GamelogTest {

    Gamelog gamelog = new Gamelog();

    @Test
    void testSaveLog(){
    gamelog.updateLog('X');
    gamelog.updateLog('X');

    gamelog.saveLog();
    }


}
  