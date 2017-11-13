/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goodday
 */
public class Cards {
    
    private int color, value;
    private String[] cardColor = {"Blue", "Green", "Red", "Yellow", "Black"};
    private String[] cardValue = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "PlusTwo", "Reverse", "Skip", "Wild", "WildPlusFour"};   

    public Cards(int cColor, int cValue){
        color = cColor;
        value = cValue;
    }
    
    public String toString(){
         String cardInfo = cardColor[color] + cardValue[value];
        return cardInfo;
    }
    
    public String getImageName(){
        String imageName = cardColor[color] + cardValue[value] + ".png";
        return imageName;
    }
    
    public int getValue(){
       return value;
    }
    
    public int getColor(){
       return color;
    }
}
