
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DiscardPile {
    ArrayList<Cards> discardPile = new ArrayList<Cards>();
    
    void add(Cards card) {
        discardPile.add(card);
    }

    public int size(){
        return discardPile.size();
    }

    /*
    public Cards remove() {
       return discardPile.remove(0);
    } */
    
    public Cards getTopCardInfo(){
      Cards c = discardPile.get(discardPile.size()-1);
      return c;
  }
    
//    public int getColor(){
//        return discardPile.get(discardPile.size()-1).getColor();
//    }
//    
//      public int getValue(){
//        return discardPile.get(discardPile.size()-1).getValue();
//    }
}
