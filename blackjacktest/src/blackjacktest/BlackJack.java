package blackjacktest;

public class BlackJack {

	public static void main(String[] args) {
		
		Meny menu = new Meny();
		
		//Database database= new Database();
		
		Game game = new Game();
		
		//database.dbsql();
		
		menu.rules();
		
		
		game.play();
	}
}
