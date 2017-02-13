/**
 * CSI 201 Short Assignment 5: Cards.java – Cards
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 9/27/16
 * @collaborators Khoa, Abeer, Daryl
 * 
 */


package shortAssignmentHomeworks;

public class Cards {
	
	public String rankParameter;
	public String suitParameter;
	public String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
	
	//Constructor 
	public Cards (int Cardsrank, int CardsSuit){
		rankParameter = Integer.toString(Cardsrank);
		suitParameter = suits[CardsSuit-1];
		
	}
	
	//Method to access the suit of a card object
	public String suit(){
		return suitParameter;
		}
	
	//Method to access the rank of a card object
	public String rank(){
		return rankParameter;
		}

	//Method to convert the rank and suit to a string
	public String toString(){
		return rankParameter + " of " + suitParameter;
	}

	
	

}
