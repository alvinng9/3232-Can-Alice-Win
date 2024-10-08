package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canAliceWinTest() {
        Solution solution = new Solution();
        assertFalse(solution.canAliceWin(new int[]{1,2,3,4,10}));
        assertTrue(solution.canAliceWin(new int[]{1,2,3,4,5,14}));
        assertTrue(solution.canAliceWin(new int[]{5,5,5,25}));
    }
}