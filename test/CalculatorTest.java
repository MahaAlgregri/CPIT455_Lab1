/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 00019572
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Calculator instance = new Calculator(2, 3);
        int expResult = 5;
        int result = instance.sum();
        assertEquals(expResult, result);
    }
    @Test
    public void testSum_negativeNumbers() {
        System.out.println("sum");
        Calculator instance = new Calculator(-2, -3);
        int expResult = -5;
        int result = instance.sum();
        assertEquals(expResult, result);
    }
    @Test
    public void testSum_BothNegativePositiveNumbers() {
        System.out.println("sum");
        Calculator instance = new Calculator(2, -3);
        int expResult = -1;
        int result = instance.sum();
        assertEquals(expResult, result);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Calculator instance = null;
        int expResult = 0;
        int result = instance.sub();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muliply method, of class Calculator.
     */
    @Test
    public void testMuliply() {
        System.out.println("muliply");
        Calculator instance = null;
        int expResult = 0;
        int result = instance.muliply();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        Calculator instance = null;
        int expResult = 0;
        int result = instance.division();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEven method, of class Calculator.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        int x = 2;
        Calculator instance = new Calculator();
        boolean result = instance.isEven(x);
        assertTrue(result);
    }
    
}
