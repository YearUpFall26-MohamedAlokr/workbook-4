package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many players? ");
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Player> players = new ArrayList<>();
        for(int i = 0; i < playerCount; i++)
        {
            System.out.print("Enter player name: ");
            String name = scanner.nextLine();

            players.add(new Player(name));
        }

        Deck deck = new Deck();
        deck.shuffle();

        for(int i = 0; i < 2; i++)
        {
            for(Player player : players)
            {
                player.getHand().deal(deck.deal());
            }
        }

        Player winner = null;
        int bestScore = 0;

        for(Player player : players)
        {
            System.out.println("\n" + player.getName());

            player.getHand().displayHand();

            int score = player.getHand().getValue();

            System.out.println("Score: " + score);

            if(score <= 21 && score > bestScore)
            {
                bestScore = score;
                winner = player;
            }
        }

        System.out.println("\n----- RESULTS -----");

        if(winner != null)
        {
            System.out.println("Winner: "+ winner.getName()
                    +" with "+bestScore+" points!");
        }
        else
        {
            System.out.println("Everyone busted!");
        }
    }
}
