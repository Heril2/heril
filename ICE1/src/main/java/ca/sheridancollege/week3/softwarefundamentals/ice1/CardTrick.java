/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then searches the array for a hardcoded lucky card.
 * 
 * Modifier: Heril Patel
 * Student Number: 991785988
 * Date Modified: 01-06-2025
 * 
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations, you get the lucky card: " +
                    luckyCard.getSuit() + " " + luckyCard.getValue());
        } else {
            System.out.println("Sorry, the lucky card was not found in the magic hand.");
        }

        System.out.println("\nHere is the magic hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }
    }
}
