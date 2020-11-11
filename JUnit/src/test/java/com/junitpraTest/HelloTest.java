package com.junitpraTest;

import com.junitpra.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HelloTest {
    @Test
    public void testSpeak() {
        Hello.speak();
    }

    @Test
    public void testFact() {
        assertEquals(1, Hello.fact(1));
        assertEquals(2, Hello.fact(2));
        assertEquals(6, Hello.fact(3));
        assertEquals(3628800, Hello.fact(10));
        assertEquals(2432902008176640000L, Hello.fact(20));
    }
}
