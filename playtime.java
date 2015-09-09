import java.util.Scanner;
import java.util.Random;

public class Playtime {

    public static void main(String []args) {

		int  maxNum;
		boolean exitNum;
		String inputString;
		String playAgain;
		int myGuess;
		exitNum = true;
		System.out.println("Welcome to Playtime ");
		System.out.println("The object is to guess the correct number.");
	
			maxNum = 10;
		
			
			if (args.length > 0) {
			    try {
			    	maxNum = Integer.parseInt(args[0]);
			    	System.out.println("The max number is:" + maxNum + " ");
			    } catch (NumberFormatException e) {
			       // System.err.println("Argument" + args[0] + " must be an integer.");
			       // System.exit(1);
			    	
			    }
			}
			 Scanner in = new Scanner(System.in);
			while (exitNum) {
				 System.out.println("Please, enter a number between 1 and " +maxNum+ ":");
				 if (in.hasNextLine()) {
					 try {
					 inputString = in.nextLine();
					 myGuess = Integer.parseInt(inputString);
					 } catch (NumberFormatException e) {
						 myGuess = 0;
						 System.out.println("***You must enter a number between 1 and " + maxNum + "***");
						 continue;
					 }
				 }else {
					 myGuess = 0;
				 }
				 if (myGuess < 1 || myGuess > maxNum)
				 {
					 System.out.println("***You must enter a number between 1 and " + maxNum + "***");
					 continue;
				 }
				Playtime(maxNum, myGuess);
				System.out.println("Would you like to play again? (Y/n)");
				 if (in.hasNextLine()) {
					 playAgain = in.nextLine();
					 
					 if (playAgain.equals("y") || playAgain.equals("Y") || playAgain.equals("")){
						 exitNum = true;
						 continue;
					 }
					 else
					 {
						 System.out.println("Thank you for playing. Bye.");
						 exitNum = false;
						 break;
					 }
				 }
				 
				
			}
			 in.close();   
        
	
    }
    public static boolean Playtime (int maxNum, int myGuess) {
    	
    	boolean type;
	
		
		 
	       // Reads a single line from the console 
	       // and stores into name variable
	
		 System.out.println("The number you chose is:" + myGuess + "  ");
	
		 Random rn = new Random();
		 int answer = rn.nextInt(maxNum) + 1;

		 if (answer == myGuess)
		 {
			 System.out.println("You guessed " + myGuess + " correctly.");
			 type = false;
			
		 }
		 else
		 {
			 System.out.println("You guessed " + myGuess + " incorrectly. We chose " + answer + " as the correct answer.");
			 type = true;
		 }
	       // Reads a integer from the console
	       // and stores into age variable
		 return type;
	        
    	
    }
   
} 
