/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IzinIslem;

import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geronimo
 */
public class adminyeniIzinTest {
    
    public adminyeniIzinTest() {
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
     * Test of baglantiAc method, of class adminyeniIzin.
     */
    @Test
    public void testBaglantiAc() throws Exception {
        System.out.println("baglantiAc");
        adminyeniIzin instance = new adminyeniIzin();
        Statement expResult = null;
        Statement result = instance.baglantiAc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baglantiKapat method, of class adminyeniIzin.
     */
    @Test
    public void testBaglantiKapat() throws Exception {
        System.out.println("baglantiKapat");
        adminyeniIzin instance = new adminyeniIzin();
        instance.baglantiKapat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class adminyeniIzin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        adminyeniIzin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
