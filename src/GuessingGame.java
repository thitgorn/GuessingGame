import java.util.Random;

/**
 * Game of guessing a secret number
 * 
 * @author Thitiwat Thongbor
 * @version 2017.01.20
 */
public class GuessingGame {

	/* properties of a guessing game */
	// Declare variables for attributes of the game
	private int upperBound;
	private int secret;
	private String hint;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) { // this is constructor

		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		setHint("I'm thinking of a number between 1 and " + upperBound);
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	/**
	 * check guess number and also prepare for user hint.
	 * 
	 * @param number
	 *            the user's input for guessing number
	 * @return the answer that is match with the secret number or not
	 */
	public boolean guess(int number) {
		if (number == secret) {
			setHint("Right! The secret is " + secret);
			return true;
		} else if (number > secret) {
			setHint("Sorry , too large.");
		} else if (number < secret && number != Integer.MIN_VALUE) {
			setHint("Sorry , too small");
		}
		return false;
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess.
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * set the String for hint
	 * 
	 * @param hint
	 *            is the String for giving user hint
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}

}
