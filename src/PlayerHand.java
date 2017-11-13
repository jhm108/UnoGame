
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
public class PlayerHand {
    ArrayList<Cards> hand = new ArrayList<Cards>();

    public void deal(Deck deck){
        for (int i = 0; i < 7; i++){
              System.out.println("AI.added " + deck.getCard(0));
            hand.add(deck.remove());
        }
    }
    
    
    public Cards play(Cards discard){
        boolean played = false;
        for (int i= 0; i<hand.size(); i++){
            if(hand.get(i).getColor() == discard.getColor() || discard.getValue() == hand.get(i).getValue() || hand.get(i).getColor() == 4 || discard.getColor() == 4){
                played = true;
                Cards temp = new Cards(hand.get(i).getColor(), hand.get(i).getValue());
                hand.remove(i);
                return temp;
            }
        }
          Cards c = new Cards(50, 50);
          return c;
    }
    
}
