package ifElse;

public class IfElse {
	
	/* If Else statement is used to apply conditions on variables or values
	  
	 * Types of if else : 

       1. Simple if Statement 
       2. if else statement 
       3. if else ladder statement  
       4. nested if statement 
       5. nested if-else statement 
       
       syntax : 

		  true / false
	 */

	public static void main(String[] args) {
		
		/*1> Simple if Statement :

			if(condition){
			// when if block condition is true then it is executed 
			}
		*/
		
		int age = 21;
		
		       if(age > 18) {
			       System.out.println("The person is eligible for voting");
		       }
		System.out.println("------------------------------------------------------------------------------------------");
		
        /*2> Simple if-else Statement :

             if(condition){
             // when if block condition is true then it is executed 
             }
             else{
          }
        */	
		
		int a = 17; // for now i will take 'age' as 'a' because of duplicate variable occurrence 
		
		        if(a > 18) {
			        System.out.println("The person is eligible for voting");
		        }
		        else {
			        System.out.println("The person is not eligible for voting");
		        }
		
		System.out.println("--------------------------------------------------------------------------------------");	
		
		/*3> if else Ladder : 
		  
		     if(condition 1){
             // when if block condition is true then it is executed
             }
             else if(condition 2) {
             // when else if block condition is true then it is executed
             }
             else {
             }
		 */
		
		String clr = "Blue";
		
				if (clr == "Red") { 
					System.out.println("STOP ... !");
				}
				else if (clr == "Yellow") { 
					System.out.println("Ready to Go ... !");
				} 
				else if (clr == "Green") {
					System.out.println("GO ... !");
				}
				else {
					System.out.println("Invalid Input ... !");
				}
				
		System.out.println("--------------------------------------------------------------------------------------");
		
		// Now lets write a program to find even and odd numbers with If-Else statements 
		
		int num = 67;

		        if (num % 2 == 0) { 
			        System.out.println("Even Number - " + num);
		        }
		        else {
			        System.out.println("ODD Number - " + num);
		        }
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		// Now lets write a program to find if a number is positive or negative or zero 
		
		int b = 12;
		
		        if (b > 0) {
		            System.out.println("The number is positive");
		        }
		        else if (b < 0) { 
		        	System.out.println("The number is negative");
		        }
		        else if (b ==0) {
		        	System.out.println("The number is zero");
		        }
		        
	    System.out.println("--------------------------------------------------------------------------------------"); 
	    
	    // Now lets write a program to compare two numbers and print the greater one.
	    
	    int c = 15;
	    int d = 20;

	    		if (c > d) {
	    			System.out.println("Greater number is " + c);
	    		}
	    		else if (d > c) {
	    			System.out.println("Greater number is " + d);
	    		}
	    		else {
	    			System.out.println("Both numbers are equal");
	    		}
		
		System.out.println("--------------------------------------------------------------------------------------"); 		
	    		
	    /*4. nested if statement :

		     if(condition){
			 // when if block condition is true then it is executed
		     if(condition){
			 // when if block condition is true then it is executed
		           }
		    }	
	    	 */
	    
	   			if (true) {
	   				System.out.println("Cars 3");
	   			if (false) {
	   				System.out.println("Avengers Endgame");
			}
		}
	   			
	   	System.out.println("--------------------------------------------------------------------------------------");
	   			
	   	/*5. nested if-else statement :

			if(condition 1){
			// when if block condition is true then it is executed
		    if(condition 2){
			// when if block condition is true then it is executed
		     }else{
		   }
		    
	   }	
	   	 */
	   			
 		int Age = 39;
 		int pinCode = 411019; 
 		double salary = 69000;
	   
	   			if (Age >= 18) {
	   				System.out.println("1st Stage Clear move to Next Step");
	   			if (pinCode >= 411019) { 
		   				System.out.println("Loan is Available for specific city ...!");
	   			if (salary >= 45000) {
	   				System.out.println("Loan Approved ...!");
	   			} 
	   			else {
	   				System.out.println("Not available in this city ");
	   				}
	   			}
	   			else {
	   				System.out.println(" sorry...! ");
	   			}
	   			}
	   			else {
	   				System.out.println("UR NOT ELIGIBLE ... !");
	   			}
	   			
	   System.out.println("--------------------------------------------------------------------------------------");
	    		
	}
}

