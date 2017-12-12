package ie.ucd.cluedo;

public class Main {
	public static void main (String[] args) {
		//Create Board, Cards, Pawns and mystery
		Game cluedo = new Game();
		Board apartment=new Board();
		Hypothesis hepo=new Hypothesis();
		Map map=new Map();
		map.checkMap();
		
		apartment.createRooms();
		cluedo.createCards();	
		cluedo.createMystery();	
		cluedo.createPawns();
		cluedo.creatPlayer();
	   	cluedo.distributeCards();
	   	
	    cluedo.startGame(hepo, apartment);
		
	}
}
