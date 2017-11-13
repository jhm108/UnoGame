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
 * @author jhm108
 */
public class PlayerHandTest {
    
    public PlayerHandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deal method, of class AI.
     */
    @Test
    public void testDeal() {
        System.out.println("deal");
        Deck deck = new Deck();
        deck.load();
        PlayerHand instance = new PlayerHand();
        instance.deal(deck);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.hand.size() == 7);
    
    }

    /**
     * Test of play method, of class AI.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        
        Deck deck = new Deck();
        deck.load();
        
        Cards discard = new Cards(0,1);
        PlayerHand instance = new PlayerHand();
        instance.deal(deck);
        Cards expResult = new Cards(0,0);
        Cards result = instance.play(discard);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
