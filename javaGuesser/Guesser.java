public class Guesser {

	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Guesser()
	} // end main
	
	Guesser() {
		int response = 0;
		boolean keepGoing = true;
		while (keepGoing) {
			printMenu();
			System.out.println("Please Enter 0-2: ");
			response = input.nextInt();
			if (response == 0) {
				keepGoing = false;
			} //Rest is W.I.P...
		} // end while loop
	} // end constructer
	
	void printMenu() {
		System.out.println("0) Exit \n1) Human Guesser \n2) Computer Guesser \n");
	} // end printMenu
}
