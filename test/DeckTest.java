/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jht108
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of load method, of class Deck.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        Deck instance = new Deck();
        instance.load();
         assertTrue(instance.size() == 108);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        Deck instance2 = new Deck();
        instance.load();
        instance2.load();
        instance.shuffle();
        
        assertTrue(instance.getCard(0) != instance2.getCard(0));
        
        assertTrue(instance.getCard(1) != instance2.getCard(1));
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getCard method, of class Deck.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int index = 0;
        Deck instance = new Deck();
        instance.load();
        Cards expResult = new Cards(0,0);
        Cards result = instance.getCard(index);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Deck.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Deck instance = new Deck();
        instance.load();
        Cards expResult = new Cards(0,0);
        Cards result = instance.remove();
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Deck.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Deck instance = new Deck();
        instance.load();

        int expResult = 108;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
