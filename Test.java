package test;

public class Test {
	
	    public static void main(String[] args) {

	        String s = "nishantshastri2004@gmail.com";
	        int vowels = 0, consonants = 0;

	        for(int i = 0; i < s.length(); i++) {

	            char ch = s.charAt(i);

	            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	                vowels++;

	            else if(ch>='a' && ch<='z')
	                consonants++;
	        }

	        System.out.println("Vowels = " + vowels);
	        System.out.println("Consonants = " + consonants);
	    }
	}
				
