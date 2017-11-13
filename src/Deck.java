
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goodday
 */
public class Deck {
    ArrayList<Cards> deck = new ArrayList<Cards>();
    
  void load(){
      
      for (int k = 0; k < 2; k++){ // Double the size 
        for (int i = 0; i <= 4; i++){
          if (i != 4){
                for (int j = 0; j < 13; j++){
                Cards card = new Cards(i, j);
                deck.add(card);
                }
          }else{
            for (int j = 13; j < 15; j++){
                Cards card = new Cards(i, j);
                deck.add(card);
            }
          }
        }
      }
      
      
  }
  
  public void shuffle(){
        Collections.shuffle(deck);
    }
  
  public Cards getCard(int index){
      Cards c = deck.get(index);
    //  deck.remove(index);
      return c;
  }

  public Cards remove() {
        return deck.remove(0);
  }
  
  public int size(){
      return deck.size();
  }
  
  
}


