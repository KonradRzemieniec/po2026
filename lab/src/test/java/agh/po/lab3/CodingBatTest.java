package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    @Test
    public void array123() {
        CodingBat cb = new CodingBat();
        assertEquals(true,cb.array123(new int[]{1,2,3,4,}));
        assertEquals(true,cb.array123(new int[]{1,2,3,5,}));
    }

    @Test
    public void lucky13() {
        CodingBat cb1 = new CodingBat();
        assertEquals(true,cb1.lucky13(new int[]{2, 7, 2, 8}));
        assertEquals(false,cb1.lucky13(new int[]{1, 2, 4}));
    }

    @Test
    public void sameEnds() {
        CodingBat cb2 = new CodingBat();
        assertEquals("ab", cb2.sameEnds("abXYab"));
        assertEquals("x", cb2.sameEnds("xx"));
        assertEquals("x", cb2.sameEnds("xxx"));
        assertEquals("", cb2.sameEnds("abc"));
        assertEquals("", cb2.sameEnds(""));
    }
}