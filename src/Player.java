
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhm108
 */
public class Player {
    ArrayList<Cards> hand = new ArrayList<Cards>();
    
    public void deal(Deck deck){
        for (int i = 0; i < 7; i++){
            System.out.println("User.added " + deck.getCard(0));
            hand.add(deck.remove());
        }
    }
    
}
