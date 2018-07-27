
import java.util.Scanner; //For user input  
import java.util.*;

public class Animal 
{
	//public: available to anyone
	//static: value will be shared by any Animal object that is created
	//final: constant and cannot be changed. Common to be in ALL CAPS
	//double: allows you to have decimal
	public static final double FAVNUMBER = 1.6180;

	//All java datatypes
	// Private: can be accessed by ONLY other methods in the class
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age; 
	//Massive number: goes from -2^63 to 2^63
	private long uniqueID;
	// unsigned ints. single characters only
	private char favoriteChar;
	private double speed;
	//32 bit number with decimals. Not as accurate as double. 
	private float height;

	//Protected: This value can only be accessed by files in the package
	//static: every object shares the value/variable. 
	//Whatever you do in one instance will affect other instances. 
	protected static int numberOfAnimals = 0;

	//Scanner: allows you to accept user input from keyboard
	//system.in : means we want data from keyboard
	static Scanner userInput = new Scanner(System.in);

	//everytime an animal object is created, you need a constructor
	//constructor is in super class
	public Animal() {
		// super();  //Animal is the super class so this code is not needed. 

		//whenever we enter the animal constructor it means a new animal instance has been created. 
		//so increment by one
		numberOfAnimals++; 

		int sumOfNumbers = 5 + 1;

		//shortcut: "sysout" then control + shift = system.out.println
		System.out.println("5 + 1 = " + sumOfNumbers);

		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);

		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);

		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);

		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);

		//Print: does not go to new line like println does. 
		//\n: goes to new line. needed for print command but not for println. 
		System.out.print("Enter the name: \n");

		// hasNextInt, hasNextFloat, hasNextDoble, hasNextBoolean, hasNextByte etc.
		if (userInput.hasNextLine()) //asking if user entered a string
		{
			//'this' refers to object that is created. In this case, "theAnimal"
			this.setName(userInput.nextLine()); // nextInt, nextFloat, nextDouble etc.

		}

		//this.setFavoriteColor();
		//this.setUniqueID();

	}

	//GETTERS AND SETTERS
	// NOT NEEDED FOR STATIC DATA
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public void setUniqueID() {
		this.uniqueID = uniqueID;
		long minNumber = 1;
		long maxNumber = 1000000;

		//(long) means casting. casting from one data type to whatever is in the brackets. 
		this.uniqueID = minNumber +  (long) (Math.random() * ((maxNumber - minNumber) +1 ));

		//convert primitive data type to string
		//put whatever you want to convert in the bracket
		String StringNumber = Long.toString(maxNumber);

		//convert string to primitive
		int numberString = Integer.parseInt(StringNumber);
		System.out.println("Unique ID set to: " + this.uniqueID);
	}


	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;

		this.favoriteChar = (char) randomNumber;

		if(randomNumber == 32) {
			System.out.println("Favorite character set to Space");
		} 
		else if(randomNumber == 10) 
		{
			System.out.println("Favorite character set to Newline");
		} 
		else 
		{
			System.out.println("Favorite character set to: " + this.favoriteChar);
		}

		//logical operators: 
		/* !	 - Not	- Unary	- Returns true if the operand to the right evaluates to false. 
		 * Returns false if the operand to the right is true.

		   &	 - And	- Binary	Returns true if both of the operands
		evaluate to true. Both operands are evaluated before the And operator is applied.

		   | -	Or  - Binary	 => Returns true if at least one of the
		operands evaluates to true. Both operands are evaluated before the Or operator is applied.

		   ^	 -  Xor - Binary =>	Returns true if one — and only one — of the operands evaluates to true. Returns false
		if both operands evaluate to true or if both operands evaluate to false.

		  &&	 - Conditional And - Binary =>	Same as &, but if the operand on the left returns false, it returns false without evaluating the operand on the
		right.

		||	- Conditional Or	 - Binary => Same as |, but if the operand on the left returns true,
		 it returns true without evaluating the operand on the right. */

		if ((randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("Favorite character is a lowercase letter");

		}
		if (((randomNumber > 97) && (randomNumber < 122)) || (randomNumber > 64) && (randomNumber < 91)) {
			System.out.println("Favorite character is a letter");

			//if randomNumber is less than 50, randomNumber becomes whichIsBigger.
			//Else randomNumber will be assigned to whcihIsBigger
			int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

			
			switch(randomNumber) {
			
			// case x where x is the number we are looking for randomNumber to be
			// case takes an int, byte, 'char' or in java 7 and above, also "string"
			case 8:
				System.out.println("Favorite character set to backspace");
				break; //break takes you out of the switch statement
			
				case 9:
				case 10:
				case 11:
					System.out.println("Favorite character set to backspace");
					break;
					
				default :
					System.out.println();
					break;
			}
		}
	}


	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	protected static void countTo(int startingNumber) 
	{
		for (int i = startingNumber; i <= 100; i++) 
		{
				//'continue will jump out at 90 and jump back up to the for loop
				if(i == 90) continue;
				
				System.out.println(i);
		}
	}
	
	//String here instead of VOID becomes it returns a string
	protected static String printNumbers(int maxNumbers)
	{
		//While Loop
		//whatever you want to increment should be outside the while loop
		int i = 1;
		while(i < (maxNumbers / 2)) 
		{
			System.out.println(i);
			i++;
			
			if(i == (maxNumbers/2)) break;
		}
		
		Animal.countTo(maxNumbers/2);
		
		return "End of printNumbers";
	}
	
	protected static void guessMyNumber() {
		int number;
		
		//Do - while Loop
		do {
			System.out.println("Guess number up to 100");
			while(!userInput.hasNextInt()) 
			{
				
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number \n", numberEntered);
			}
		
			
			number = userInput.nextInt();
		}
		
		while(number !=50);
		
	}
	
	public String makeSound() {
		return "Grrr";
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says " + randAnimal.makeSound());
	}
	//first function that will run when the code is executed
	//args is an array here
	public static void main(String[] args) {

		Animal theAnimal = new Animal ();
		
		//create array with array length
		int[] favoriteNumber  = new int[20];
		favoriteNumber[0] = 100;
		
		
		String[] stringArray = {"Different", "Strings", "inArray"};
		
		//String - datatype of the array
		//word - variable where value would be stored
		//stringArray - name of the array
		for(String word : stringArray) {
			 System.out.println(word);
			 // print out every single value and store them one by one in 'word'
		}
		
		//copying an array
		//copyOf takes 2 arguments: array name and length
		String [] cloneOfArray = Arrays.copyOf(stringArray, 3);
		
		//Print out entire array
		System.out.println(Arrays.toString(cloneOfArray));
		
		//Search an array for specific item and print out index of that item
		System.out.println(Arrays.binarySearch(cloneOfArray, "Different"));
	
	}

}
