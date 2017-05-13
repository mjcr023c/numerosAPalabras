/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosapalabras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MJCR-L
 */
public class NumerosAPalabrasTest {

    public NumerosAPalabrasTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of convertNumbertoWords method, of class NumerosAPalabras.
     */
    @Test
    public void testConvertNumbertoWords() {
        System.out.println(NumerosAPalabras.class + ": convertNumbertoWords");
        int i = 0;
        NumerosAPalabras instance = new NumerosAPalabras();
        String expResult = "cero";
        String result = instance.convertNumbertoWords(i);
        assertEquals(expResult, result);

    }

    @Test
    public void testConvertNumbertoWords2() {
        System.out.println(NumerosAPalabras.class + ": convertNumbertoWords");
        int i = 21;
        NumerosAPalabras instance = new NumerosAPalabras();
        String expResult = "ventiuno";
        String result = instance.convertNumbertoWords(i);
        assertEquals(expResult, result);

    }

    /**
     * Test of numerosaPalabras method, of class NumerosAPalabras.
     */
    @Test
    public void testNumerosaPalabras() {
        System.out.println(NumerosAPalabras.class + ": numerosaPalabras");
        int n = 0;
        NumerosAPalabras instance = new NumerosAPalabras();
        String expResult = "cero";
        String result = instance.numerosaPalabras(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumerosaPalabras2() {
        System.out.println(NumerosAPalabras.class + ": numerosaPalabras2");
        int n = 21;
        NumerosAPalabras instance = new NumerosAPalabras();
        String expResult = "ventiuno";
        String result = instance.numerosaPalabras(n);
        assertEquals(expResult, result);
    }

}
