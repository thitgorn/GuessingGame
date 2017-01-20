import java.util.Scanner;

/**
 * GameConsole UI for Guessing Game.
 * 
 * @author thitiwat
 * @version 2017.01.20
 */
public class GameConsole {

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param game
	 *            is the GuessingGame with the bound
	 * @return the secret number if the answer is right
	 */
	public int play(GuessingGame game) {
		Scanner scan = new Scanner(System.in);

		String title = "Guessing Game";
		String prompt = "Your guess? ";

		System.out.println(title);
		System.out.println(game.getHint());
		int number = 0;
		while (!game.guess(number)) {
			System.out.print(prompt);
			number = scan.nextInt();
			game.guess(number);
			System.out.println(game.getHint());
		}
		return number;
	}
}
