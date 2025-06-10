/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;


import java.util.Scanner;


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

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random() * 13 + 1));
            card.setSuit(Card.SUITS[(int)(Math.random() * Card.SUITS.length)]);
            magicHand[i] = card;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Pick a card and try your luck!!");

        int userValue;
        while (true) {
            System.out.print("Enter the card value form 1 to 13: ");
            userValue = input.nextInt();
            if (userValue >= 1 && userValue <= 13) break;
            System.out.println(" I appologice for that this is incorract value. Please enter a number from 1 to 13.");
        }

        input.nextLine();

        String userSuit;
        while (true) {
            System.out.print("Enter the suit form this four Hearts, Diamonds, Spades and Clubs.: ");
            userSuit = input.nextLine();
            boolean validSuit = false;
            for (String s : Card.SUITS) {
                if (s.equalsIgnoreCase(userSuit)) {
                    userSuit = s;
                    validSuit = true;
                    break;
                }
            }
            if (validSuit) break;
            System.out.println("I appologice for that this is incorract suite. Choose from Hearts, Diamonds, Spades, Clubs that only.");
        }

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Unfortunately! you miss the chance to win, Your card was not found in the magic hand.");
        }

        System.out.println("\nThe Magic Hand was:");
        for (Card c : magicHand) {
            System.out.println(" - " + c.getValue() + " of " + c.getSuit());
        }
    }
}