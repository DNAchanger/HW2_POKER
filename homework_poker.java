package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
 * B0444239
 * ¶ÀÞ³ÑÔ 
*/
public  class homework_poker {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("How many times do you want to print?");
		int times=scan.nextInt();
		Deck deck=new Deck(times);
		deck.printDeck();
		
		if (isAllCardsCorrect(deck.getAllCards(), times)) {
			System.out.println("Well done!");
		} else {
			System.out.println("Error, please check your sourse code");
		}
		scan.close();
	}
	
	private static boolean isAllCardsCorrect(ArrayList<Card> allCards, int nDeck) 
	{

		boolean isCorrect = true;
		HashMap<String, Integer> checkHash = new HashMap<String, Integer>();
		for (Card card : allCards) 
		{
			int suit = card.getSuit();
			int rank = card.getRank();
			if (suit > 4 || suit < 1 || rank > 13 || rank < 1) 
				{
					isCorrect = false;
					break;
				}
			if (checkHash.containsKey(suit + "," + rank)) 
				{
					checkHash.put(suit + "," + rank, checkHash.get(suit + "," + rank) + 1);
				}	 
			else 
				{
					checkHash.put(suit + "," + rank, 1);
				}
		}
		if (checkHash.keySet().size() == 52) 
		{
			for (int value : checkHash.values()) 
				{
					if (value != nDeck) 
					{
						isCorrect = false;
						break;
					}
				}
			} 
		else 
			{
				isCorrect = false;
			}
		return isCorrect;
	}

	static class Deck 
	{
		private ArrayList<Card> cards;
		public Deck(int times)
		{
			cards = new ArrayList<Card>();
			for (int n = 0; n < times; n++) 
			{
				for (int flower = 1; flower < 5; flower++) 
				{
					for (int num = 1; num < 14; num++)
					{
						Card card = new Card(flower, num);
						cards.add(card);
					}
				}
			}
		}
		public void printDeck()
		{
			for(Card printing:cards)
			{
				printing.printCard();
			}
		}
		public ArrayList<Card> getAllCards() 
		{
			return cards;
		}
		
	}
	static class Card 
	{
		private int suit, rank; 
		public Card(int a, int b) {
			suit = a;
			rank = b;
		}
		public void printCard() {
			System.out.println(suit + "," + rank);
		}
		public int getSuit() {
			return suit;
		}
		public int getRank() {
			return rank;
		}
	}

}
