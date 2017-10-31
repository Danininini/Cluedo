package ie.ucd.cluedo;

public class Main {
	public static void main (String[] args) {
		
		//Create Board
		Game cluedo = new Game();
		//Create Cards
		cluedo.createCards();	
		//Create mystery
		cluedo.mystery();	
		
		//Create Pawns	 
		cluedo.createPawns();
		
	    //Create player
		
	    
		//Distribute cards
		cluedo.distributeCards();
		
		System.out.println("Finished main");
	}
}
