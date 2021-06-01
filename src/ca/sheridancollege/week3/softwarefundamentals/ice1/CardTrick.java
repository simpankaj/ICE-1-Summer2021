/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            System.out.println(c.getSuit() + " " + Integer.toString(c.getValue()));
            
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please select a cart suit");
        System.out.println("1 for Hearts, 2 for Diamonds, 3 for Spades or 4 for Clubs");
        
        String suitStr = scanner.nextLine();
        int suitValue = Integer.parseInt(suitStr);
        String suit = Card.SUITS[suitValue];
        
        System.out.println("Please enter a card value between 1 and 13");
        
        String valueStr = scanner.nextLine();
        int value = Integer.parseInt(valueStr);
        
        System.out.println("Your card:");
        System.out.println("Suit: " + suit);
        System.out.println("Value: " + valueStr);
        
        for (int i=0; i<magicHand.length; i++)
        { 
            if (magicHand[i].getSuit() == suit && magicHand[i].getValue() == value) {
                System.out.println("The Magic Hand does contain your card");
                return;
            }
        }
        System.out.println("The Magic Hand does NOT contain your card");

    }
    
}
