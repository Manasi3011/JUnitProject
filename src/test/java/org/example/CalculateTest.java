package org.example;
import org.example.Calculate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void add() {

        assertEquals(5,Calculate.add(3,2));
    }

    @Test
    public void sub() {
        assertEquals(-1,Calculate.sub(8,9));
    }

    @Test
    public void multiply() {
        assertEquals(10,Calculate.multiply(5,2));
    }

    @Test
    public void divide() {
        assertEquals(5,Calculate.divide(50,10));
    try{
        Calculate.divide(4,8);
        fail("IllegalArgumentException to be thrown");
    }catch (IllegalArgumentException e){
        assertEquals("cannot divide by zero",e.getMessage());
    }
    }

    @Test
    public void arrayInsert() {
        Integer[] expected={1,2,3};
        Integer[] actual={1,2,3};
        assertArrayEquals(expected,Calculate.ArrayInsert(actual));
    }
}