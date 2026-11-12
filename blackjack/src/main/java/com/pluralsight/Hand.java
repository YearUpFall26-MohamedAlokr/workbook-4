package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }

    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public ArrayList<Card> getCards()
    {
        return cards;
    }

    public int getValue(){
        int total = 0;
        int aceCount = 0;

        for(Card card : cards)
        {
            if(!card.isFaceUp())
            {
                card.flip();
            }

            total += card.getPointValue();

            if(card.getValue().equalsIgnoreCase("A"))
            {
                aceCount++;
            }
        }
        //Here We handel the Ace to avoid bust
        while(total > 21 && aceCount > 0)
        {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void displayHand() {
        for(Card card : cards)
        {
            if(!card.isFaceUp())
            {
                card.flip();
            }

            System.out.println(card.getValue() +" of "+ card.getSuit());
        }
    }
}
