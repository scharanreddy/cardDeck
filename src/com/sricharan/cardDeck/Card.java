package com.sricharan.cardDeck;

import com.sricharan.card.enums.Ranks;
import com.sricharan.card.enums.Suits;

/**
 * 
 * @author Sricharan Reddy
 * 
 * Class to represent a classic French Playing Card
 *
 */

public class Card {
   
	    //Member variables to assign rank and suit
	    private Suits suit;
	    private Ranks rank;
		
	    //Getters and Setters to get rank and suit
		public Suits getSuit() {
			return suit;
		}

		public void setSuit(Suits suit) {
			this.suit = suit;
		}
	
		public Ranks getRank() {
			return rank;
		}

		public void setRank(Ranks rank) {
			this.rank = rank;
		}

	/**
	 * Constructor for Card Object
	 * @param suit
	 * @param rank
	 */
	public Card(Suits suit, Ranks rank) {
	    this.suit = suit;
	    this.rank = rank;
	}
	
	/**
	 * 
	 * To String representation of the Card
	 */
	public String toString(){
		StringBuilder s = new StringBuilder();
		
		s.append("The suit of the card is ");
		
		//Case for assigning suit values
		switch(suit)
		{
		case SPADES:s.append("Spades ");break;
		case HEARTS:s.append("Hearts ");break;
		case DIAMONDS:s.append("Diamonds ");break;
		case CLUBS:s.append("Clubs ");break;
		}
		s.append("and the rank of the card is ");
		//Case for assigning Rank values
		switch(rank)
		{
		case ACE:s.append("Ace ");break;
		case TWO:s.append("Two ");break;
		case THREE:s.append("Three ");break;
		case FOUR:s.append("Four ");break;
		case FIVE:s.append("Five ");break;
		case SIX :s.append("Six ");break;
		case SEVEN:s.append("Seven ");break;
		case EIGHT:s.append("Eight ");break;
		case NINE:s.append("Nine ");break;
		case TEN:s.append("Ten ");break;
		case JACK:s.append("Jack ");break;
		case QUEEN:s.append("Queen ");break;
		case KING: s.append("King ");break;
		}
		return s.toString();
	}
}