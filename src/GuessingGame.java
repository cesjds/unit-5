import javax.swing.JOptionPane;

/********************************************************************
 * Written by: Yoav Amit
 * Period: 1
 * 
 * ASSIGNMENT:  Write a program that lets the user play a guessing 
 * game!  Your program should:
 *  - ask the user for the high number between 1 and 1000.
 *  - generate a random number between 1 and the high number.
 *  - ask the user to guess the random number.
 *  - tell the user whether they are too high or too low.
 *  - let the user continue to guess until they guess the correct 
 *   	number.
 *  - print a congratulations message that contains the number of
 * 		guesses it took the user to guess the correct number.

 * Since we are short of time using methods is optional. If you would
 * like a little more of a challenge give this a try!
 * You should have methods that accomplish the following tasks:
 *  - changeJOP:  changes the JOP colors & fonts.
 *  - intro:  prints the introduction and the rules.
 *  - getHighNum:  asks the user for the high number and returns it.
 *  - playGame:  plays the game and returns the number of guesses.
 *  - results: prints a congratulations message along with the number
 *  		of guesses it took the user to get the right number.
 *   
 ********************************************************************/

public class GuessingGame 
{
	public static void main(String[]args) {

		// This is the opening page. It introduces the user to the program

		String openScreen = "";

		openScreen +=  "Welcome to my guessing game!"+"\n";
		openScreen +=  "You need to guess my lucky number."+"\n";
		openScreen +=  "If you get a wrong answer, I will tell you if you're too high or too low."+"\n";
		openScreen +=  "Once you get the correct number, I will tell you how many guesses it took you."+"\n";
		openScreen +=  "Press OK to begin!"+"\n";

		JOptionPane.showMessageDialog(null, openScreen);

		// This part asks the user for the highest possible number that will be used in the game

		int highNum = 0;

		do {
			highNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the highest number you want possible."+"\n"+"It has to be between 1 and 1000 (inclusive)"));
		} while (highNum <= 1 || highNum >= 1000);

		// This part generates a random number between 1 and the high number

		int randNum = (int) (Math.random() * highNum) + 1;

		// This part asks the user for the first guess (no hints)

		int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess between 1 and "+highNum));

		// This is the loop that checks whether its too low or too high

		int guessCounter = 1;

		while (guess != randNum)
		{
			if (guess < randNum)
				guess = Integer.parseInt(JOptionPane.showInputDialog("Your guess was too low. Try again"));
			else 
				guess = Integer.parseInt(JOptionPane.showInputDialog("Your guess was too high. Try again:"));
			guessCounter += 1;

		}

		// This part prints that the user was correct

		String answerScreen = "";

		answerScreen += guess+" is correct!"+"\n"+"It took you "+guessCounter+" tries.";

		JOptionPane.showMessageDialog(null, answerScreen);

	}

}
