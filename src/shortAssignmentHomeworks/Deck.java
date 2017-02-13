/**
 * CSI 201 Short Assignment 5: Deck.java – Deck
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 9/27/16
 * @collaborators Khoa, Abeer, Daryl
 * 
 */

package shortAssignmentHomeworks;

import java.util.ArrayList;

public class Deck {	
	
	//Creates the ArrayList 
	ArrayList<Cards> deck = new ArrayList<Cards>();
	
	//Static Variable
	public static final int SUITS = 4;
	public static final int RANKS = 13;

	//Constructor
	public Deck(){
	}
	
	//Test Code from professor
	public static void main(String[] args){
		Cards Cards = new Cards(5, 1);
		// prints "5 of clubs"
		System.out.println(Cards.toString());
		  
		Cards Cards1 = new Cards(12, 4);
		// prints "Queen of hearts"
		System.out.println(Cards1.toString());
		  
		System.out.println("----");
		  
		Deck deck1 = new Deck();
		// Add the 52 standard Cards to the new deck
		deck1.addStandardCards();
		// print the Cards in the deck1
		for (int i = 0; i < deck1.getCardsList().size(); i++) {
		  System.out.println(deck1.getCardsList().get(i).toString());
		}
		  
		  
		Deck deck2 = new Deck();
		// Add 52 standard Cards to the new deck in random order;
		deck2.addStandardCardsRandom();
		
		// Create a new tiny Deck of Cards called hand, made up
		//  of the last five Cards in deck.  The deal method should
		//  also remove those last five Cards from "deck2".
		Deck hand = new Deck();
		hand.addCards(deck2.deal(5));
		
		System.out.println("----");
		  
		// print the Cards in the hand
		for (int i = 0; i < hand.getCardsList().size(); i++) {
		  System.out.println(hand.getCardsList().get(i).toString());
		}
		      
		  
		System.out.println("----");
		  
		// print the remaining Cards in the deck2
		for (int i = 0; i < deck2.getCardsList().size(); i++) {
		  System.out.println(deck2.getCardsList().get(i).toString() );
		}
	}

	//Method for adding cards randomly 
	public void addStandardCardsRandom(){
		
		//Loop to create a card object with a random suit and rank
		for(int i=1; i<=SUITS; i++){   // i<= 4 because of 4 suits
			for(int j=1; j<=RANKS; j++){deck.add(new Cards(j,i));}
		}
		
		//Loop that cycles to shuffle the deck randomly 
		for(int w=0; w<=1000; w++){ 
			int num = (int)(Math.random()*52);  // randomly generates a number between 1 and 52
			Cards temp = new Cards(1,1);		// defines the card object
			temp = deck.get(num);				// adding the random number 'num' to the ArrayList 'deck'
			deck.remove(num);					// removes the initial 'num' from the ArrayList
			deck.add(temp);						// adds the new 'temp' to the ArrayList
		}
	}

	// Method that initializes a deck of 52 cards that are not shuffled
	public void addStandardCards(){				
		for(int i=1; i<=SUITS; i++){				// Loops through the number of suits
			for(int j=1; j<=RANKS; j++){			// Loops through the ranks
				deck.add(new Cards(j,i));		// adding each card to the empty array list
			}
		}
	}
	
	// Method that returns the generated ArrayList
	public ArrayList<Cards> getCardsList(){
		return deck;
		}
	
	// Method that adds cards with the given 'cardsParameter'
	public void addCards(ArrayList<Cards> cardsParameter){
		
		// Loop that adds the cards given the parameter 
		for(int i=0; i <cardsParameter.size(); i++){
			deck.add(cardsParameter.get(i));
			}
	}
	
	// Method that returns the last 5 elements of the deck
	public ArrayList<Cards> deal(int n){
		
		// Declares the new 'cardsParameter' ArrayList of type 'Cards'
		ArrayList<Cards> cardsParameter = new ArrayList<Cards>();
		
		
		//Starts at the end of the ArrayList and adds to the ArrayList backwards
		for(int i = deck.size() - 1 ; i < deck.size() - n; i--){
			cardsParameter.add(deck.get(i));
			deck.remove(i);
		}
		
		return cardsParameter;
	}


}
