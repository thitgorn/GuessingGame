import java.util.Scanner;

/**
 * GameConsole UI for Guessing Game.
 * 
 * @author Thitiwat Thongbor
 * @version 2017.01.21
 */
public class GameConsole {

	/**
	 * play a game guessing number between 1 and Bound.
	 * 
	 * @param game
	 *            is the GuessingGame with the bound
	 * @return the secret number that is right
	 */
	public int play(GuessingGame game) {
		Scanner scan = new Scanner(System.in);

		String title = "Guessing Game";
		String prompt = "Your guess? ";

		System.out.println(title);
		int number = 0;
		do {
			System.out.println(game.getHint());
			System.out.print(prompt);
			number = scan.nextInt();
		} while (!game.guess(number));

		System.out.println(game.getHint());
		scan.close();
		return number;
	}
}
