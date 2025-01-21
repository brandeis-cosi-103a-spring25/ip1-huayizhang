package edu.brandeis.cosi103a.ip1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Random;

import org.junit.Test;

public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testRollDie() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int roll = App.rollDie(random);
            assertTrue("Roll should be between 1 and 6", roll >= 1 && roll <= 6);
        }
    }
}