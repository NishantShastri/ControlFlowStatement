package ifElse;

public class SwitchCase {

	/*
	  	The switch statement in Java is used to execute one block of code among many
	  	options based on the value of an expression (usually an int, char, String, or
	  	enum).
	  
	 * When to Use switch-case : When you have multiple conditions based on the same
	   variable or expression.
	  
	 * syntax :
	   
	   
	   switch (expression) {
	   
	   case value1:
	  
	   break;
	  
	   case value2:
	  
	   break;
	   
	   case value3:
	   
	   break;
	   
	   default:
	   
	   }
	 */

	public static void main(String[] args) {

		// Example of switch case
		// Input color name (Red, Yellow, or Green) and print the appropriate action:

		String color = "Red";

		switch (color) {
		case "Red":
			System.out.println("Stop!");
			break;
			
		case "Yellow":
			System.out.println("Ready!");
			break;
			
		case "Green":
			System.out.println("Go!");
			break;
			
		default:
			System.out.println("Invalid color");
		}

		System.out.println("--------------------------------------------------------------------------------");

		// Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)
		
		int sum = 1;

		switch (sum) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
		}

		System.out.println("--------------------------------------------------------------------------------");

		// Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.

		int a = 3;
		int b = 2;
		int num = 1;

		switch (num) {
		case 1:
			System.out.println("Result = " + (a + b));
			break;

		case 2:
			System.out.println("Result = " + (a - b));
			break;

		case 3:
			System.out.println("Result = " + (a * b));
			break;

		case 4:
			System.out.println("Result = " + (a / b));
			break;

		default:
			System.out.println("Invalid choice");
		}

		System.out.println("---------------------------------------------------------------------------------");
		
		/*
		 * Take a grade character (A, B, C, D, F) as input and print a message:

			A → Excellent
			B → Good
			C → Average
			D → Poor
			F → Fail
		 */
	
		char grade = 'A';
		
		switch (grade) {
		case 'A':
            System.out.println("Excellent");
            break;

        case 'B':
            System.out.println("Good");
            break;

        case 'C':
            System.out.println("Average");
            break;

        case 'D':
            System.out.println("Poor");
            break;

        case 'F':
            System.out.println("Fail");
            break;

        default:
            System.out.println("Invalid Grade");
		}
		
		System.out.println("---------------------------------------------------------------------------------");
	
		// Use a switch statement to check if a number is even or odd 
		
		int Num = 2;
		
		switch (Num % 2) {
		case 0:
            System.out.println("Even number");
            break;

        case 1:
            System.out.println("Odd number");
            break;
		
		}
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*
		 * Write a Java program using switch case to display price of fruits.

			Example:
			1 → Apple ₹100
			2 → Mango ₹80
			3 → Banana ₹40
			4 → Orange ₹60
		 */
		
		int choice = 3;
		
		switch (choice) {
        case 1:
            System.out.println("Apple ₹100");
            break;

        case 2:
            System.out.println("Mango ₹80");
            break;

        case 3:
            System.out.println("Banana ₹40");
            break;

        case 4:
            System.out.println("Orange ₹60");
            break;

        default:
            System.out.println("Invalid choice");
        }
		
		
	}

}
