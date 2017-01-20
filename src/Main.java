/**
 * Application for Playing GuessingGame.
 * 
 * @author Thitiwat Thongbor
 * @version 2017.01.21
 */
public class Main {
	/** create objects and start the game */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}

}
