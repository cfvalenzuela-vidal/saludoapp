package com.equipo.saludo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest() {
        // Constructor vacío necesario
    }

    /**
     * @return the suite of tests being tested
     */
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(AppTest.class);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testSaludo() {
        assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
    }
}