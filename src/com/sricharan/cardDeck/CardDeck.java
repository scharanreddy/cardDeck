package com.sricharan.cardDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sricharan.card.enums.*;
/**
 * 
 * @author Sricharan Reddy
 * Class to Simulate and create a Deck of Cards
 *
 */
public class CardDeck {
	
	
	
	private List<Card> cards = new ArrayList<Card>(); //Instance Variable to Store Card Objects
	
	//Getters and Setters for Card Objects
	public List<Card> getCards() {
		return cards;
	}


	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	/**
	 * Function in Deck object to initialize a Deck of Cards
	 * 
	 * @return List of Card Objects with the French Deck of Cards
	 */
	public List<Card> initializeDeck()
	{
		
		for(Suits s:Suits.values())
		{
			for(Ranks r:Ranks.values())
			{
				Card c= new Card(s,r);
				cards.add(c);
			}
		}
		return cards;
	}
	
	
	/**
	 * Function wrapper to shuffle a list of Card Objects
	 * Using the collections.shuffle
	 * 
	 */
	public void shuffle()
	{
		Collections.shuffle(cards);
		
	}

	public static void main(String[] args) {
		CardDeck deck= new CardDeck(); // Create a Deck Object
		List<Card> cards = new ArrayList<Card>();
		Scanner scan= new Scanner(System.in);
		System.out.println("START OF CARD GAME ");
		System.out.println("Press 1 to initialise the cards, Press 0 to exit");
		String choice =scan.nextLine();
		int menuChoice=(choice!=null)?Integer.parseInt(choice):0;
		if(menuChoice==1)
		 {
			cards=deck.initializeDeck();
		 }
		 else
		 {
			System.exit(0);
		 }
		System.out.println("The cards created are below ");
		deck.print(cards);
		System.out.println("Press 2 to shuffle,0 to exit");
		choice = scan.nextLine();
		menuChoice= (choice!=null)?Integer.parseInt(choice):0;
		if(menuChoice==2)
		{
		   deck.shuffle();
		}
		else
		{
		   System.exit(0);
		}
		System.out.println("The shuffled cards are below ");
		deck.print(cards);

	}
	
    //Helper Function to print the card object
	public void print(List<Card> cards)
	{
		for(Card c:cards)
		{
			System.out.println(c);
		}
		
	}

}
