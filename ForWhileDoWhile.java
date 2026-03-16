package forWhileDoWhile;

public class ForWhileDoWhile {
	
	/*
	 * Loops are used when we want to execute a block of code multiple times.
	   Helps reduce code duplication and  improves logic flow.
	   Key idea : repeat a task until a condition becomes false.
	   
	   Types of Loops in Java :

	   (A) Entry-Controlled Loops
	   for loop
	   while loop

	   (B) Exit-Controlled Loop
	   do-while loop

	   (C) Enhanced Loop
	   for-each loop (Used for arrays and collections)
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 1) for loop syntax :

			  for(initialization; condition; updation) {
    			// code
			  }
		 */
		
		for(int i = 1; i <= 5; i++) {
		    System.out.println(i);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		/*
		 * 2) while loop syntax : 

			  while(condition) {
    		 	// code
			  }
		 */
		
		int i = 10;
		while(i >= 1) {
		    System.out.println(i);
		    i--;
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		/*
		 * 3) do - while loop syntax : 

			  do {
    			// code
			  } while(condition);
		 */
		
		int a = 1;
		do {
		    System.out.println(a);
		    a++;
		} while(a <= 5);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// To add numbers in For loop like 10+9+8+7....+1
		
		int sum = 0;
		for (int b = 1; b <= 10; b++) {
			sum = sum + b;
		}
		System.out.println(sum);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// To find factorial 
		
		int fact = 1;
		for (int c = 1; c <= 5; c++) {
			fact = fact * c;
		}
		System.out.println(fact);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// To print all even and odd number in loops 
		// This uses the if-else statement too
		
		for (int d = 1; d <= 50; d++) {
			if (d % 2 <= 0) {
				System.out.println("Even no -" + d);
			}
			else {
				System.out.println("Odd no -" + d);
			}
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Print the table of any number using loop 
		
		for (int e = 1; e <= 10; e++) {
			System.out.println("5 X " + e + " = " + (5*e));
			
		}
		
	}

}
