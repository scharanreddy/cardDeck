package com.sricharan.card.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import com.sricharan.card.enums.Ranks;
import com.sricharan.card.enums.Suits;
import com.sricharan.cardDeck.Card;
import com.sricharan.cardDeck.CardDeck;

/**
 * JUnit test for the French Playing Cards
 * @author Sricharan Reddy
 *
 */
public class CardDeckTest {

	/**
	 * Test to find the length of the Deck
	 */
	@Test
	public final void testInitializeDeck() {
		CardDeck deck= new CardDeck();
		assertEquals(52, deck.initializeDeck().size());
	}
	
    /**
     * Test to check the Shuffle functionality
     */
	@Test
	public final void testShuffle() {
		CardDeck deck=new CardDeck();
		List<Card> original=deck.initializeDeck();
		List<Card> tempCards=original.stream()
				                      .collect
				                      (Collectors.toList());
		deck.shuffle();
		assertFalse(tempCards.equals(deck.getCards()));
		
	}
	
	/**
	 * Test to check if all the Ranks are Present
	 */
	@Test
	public final void testRankofCards()
	{
		CardDeck deck=new CardDeck();
		List<Card> original=deck.initializeDeck();
		Set<Ranks> ranks = new HashSet<Ranks>();
		Set<Ranks> rankSet=new HashSet<Ranks>();
		for(Ranks r:Ranks.values())
		{
			rankSet.add(r);
		}
		for(Card c:original)
		{
			ranks.add(c.getRank());
		}
		assertTrue(rankSet.containsAll(ranks));
		
	}
	
	/**
	 * Test to check if all Suits are Present
	 */
	@Test
	public final void testSuitsofCards()
	{
		CardDeck deck = new CardDeck();
		List<Card> original = deck.initializeDeck();
		Set<Suits> suits =new HashSet<Suits>();
		Set<Suits> suitSet=new HashSet<Suits>();
		for(Suits s:Suits.values())
		{
			suitSet.add(s);
		}
		for(Card c:original)
		{
			suits.add(c.getSuit());
		}
		assertTrue(suitSet.containsAll(suits));
	}

}
