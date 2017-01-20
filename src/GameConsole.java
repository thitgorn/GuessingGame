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
	 * @return the secret number if the answer is right
	 */
	public int play(GuessingGame game) {
		Scanner scan = new Scanner(System.in);

		String title = "Guessing Game";
		String prompt = "Your guess? ";

		System.out.println(title);
		int number = Integer.MIN_VALUE;
		while (!game.guess(number)) {
			System.out.println(game.getHint());
			System.out.print(prompt);
			number = scan.nextInt();
		}
		System.out.println(game.getHint());
		System.out.println("You used " + game.getCount() + " gusses.");
		return number;
	}
}
