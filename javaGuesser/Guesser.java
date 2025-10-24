import java.util.*;

public class Guesser {

	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Guesser();
	} // end main
	
	Guesser() {
		int response = 0;
		boolean keepGoing = true;
		while (keepGoing) {
			printMenu();
			System.out.println("Please Enter 0-2: ");
			response = Integer.valueOf(input.nextLine());
			if (response == 0) {
				keepGoing = false;
			} else if (response == 1) {
				humanGuesser();
			} else if (response == 2) {
				computerGuesser();
			} else {
				System.out.println("Please enter a valid input...");
			} // end elseif
		} // end while loop
	} // end constructer
	
	void printMenu() {
		System.out.println("0) Exit \n1) Human Guesser \n2) Computer Guesser \n");
	} // end printMenu
	
	void humanGuesser() {
		int number = (int)((Math.random() * 100) + 1);
		int turns = 0;
		int guess = 0;
		boolean keepGoing = true;
		while (keepGoing) {
			turns++;
			System.out.print(turns + ") Guess a number: ");
			guess = Integer.valueOf(input.nextLine());
			if (guess > number) {
				System.out.println("Too high...");
			} else if (guess < number) {
				System.out.println("Too low...");
			} else {
				System.out.println("You got it!");
				keepGoing = false;
			} // end elseif
		} // end while loop
	} // end humanGuesser
	
	void computerGuesser() {
		int lower = 0;
		int upper = 100;
		int guess = 0;
		int turns = 0;
		String response = "";
		boolean keepGoing = true;
		while (keepGoing) {
			turns++;
			guess = (int)((lower + upper)/2);
			System.out.println(turns + ") I guess " + guess);
			System.out.print("Is this guess too (H)igh, (L)ow, or (C)orrect? ");
			response = input.nextLine();
			System.out.println("");
			if (response.equals("H")) {
				upper = guess;
			} else if (response.equals("L")) {
				lower = guess;
			} else {
				keepGoing = false;
			} // end elseif
		} // end while loop
	} // end computerGuesser
}
