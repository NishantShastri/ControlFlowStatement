package breakAndContinue;

public class BreakAndContinue {
	
	/* Break Statement : 

   	   Break is used to stop/exit a loop immediately.
 	   When to use :
	   When a condition becomes true and you want to stop the loop.
	   Used in for, while, do-while, and switch.
	   
	   ex : 

		for(int i = 1; i <= 10; i++) {
    	if(i == 5) {
        break;   // loop stops
    	}
    	System.out.println(i);
	}

	 * Continue Statement : 

	   Continue is used to skip one iteration and move to the next loop cycle.
	   When to use :
	   When you want to skip printing or processing a particular value.
	   
	   ex : 

		for(int i = 1; i <= 10; i++) {
    	if(i == 5) {
        continue;  // skips 5
    	}
    	System.out.println(i);
	}
	 */
	
	public static void main(String[] args) {
		
		// Print numbers from 1 to 50 but stop when number becomes 25.
		
		for (int i= 1; i <= 50; i++) {		
			System.out.println(i);
			if (i == 25) {
				break; // Breaks the loop at 25 
			}
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		// Print table of 9 but stop when product becomes more than 50.
		
		for (int a = 1; a <= 10; a++) {
			if (a >= 6) {
				break; // Breaks the loop before 6th table
			}
			System.out.println("9 X " + a + " = " + (9*a));		
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		// Print numbers from 1 to 50 but skip numbers divisible by 7.
		
		for (int b = 1; b <= 50; b++) {
			if (b % 7 == 0) {
				continue; // skips numbers divisible by 7
			}
			System.out.println(b);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		for (int c = 1; c <= 100; c++) {
		    if (c % 10 == 5) {
		        continue; // skips numbers ending with 5
		    }
		    System.out.println(c);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
		    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		        continue; // skips vowels a,e,i,o,u
		    }
		    System.out.println(ch);
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		// To print all odd numbers using continue statement
		// Since continue skips iterations it will skip even numbers 
		
		for (int d = 1; d <= 50; d++) {
			if (d % 2 == 0) {
				continue;
			}
			System.out.println(d);
		}
		
	}
}
