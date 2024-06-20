import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class numNexus {

	public static void main(String[] args) {
		
		System.out.println("Welcome to NumNexus");
		
		Scanner input = new Scanner(System.in);
		validity check = new validity();
		
		Random random = new Random();
		int actualNum = random.nextInt(8999) + 1000;
		while (true) {
			if (!check.checkValidity(actualNum)) {
				actualNum = random.nextInt(8999) + 1000;
			}
			else {break;}
		}

		// System.out.println(actualNum);
		
		int guessNum = 0;
		methods dummy = new methods();
		
		while (actualNum!=guessNum) {
			try {
				System.out.print("Guess the number! ");
				guessNum = input.nextInt();
				if (check.checkValidity(guessNum)) {
					System.out.println("Hint: " + dummy.textPC(actualNum,guessNum));
				}
				else {
					System.out.println("Please check your number. ");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input. ");
				input.nextLine();
			}

		}
		input.close();
		System.out.println("You have successfully guessed the number! ");
		
	}

}
