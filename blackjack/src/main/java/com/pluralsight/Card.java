package com.pluralsight;


public class Card {
    private String suit;
    private String value;
    private boolean faceUp;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
        faceUp = false;
    }

    public String getSuit() {
        if(faceUp){
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        if(faceUp){
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue(){
        // only return the value if the card is face up
        if(faceUp){
            if (value.equals("A")){
                return 11;
            }else if (
                    value.equalsIgnoreCase("K")||
                    value.equalsIgnoreCase("Q")||
                    value.equalsIgnoreCase("J"))
            {
                return 10;
            }else{
           return Integer.parseInt(value);}
        } else {
            return 0;
        }
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip(){
        faceUp = !faceUp;
    }



}
