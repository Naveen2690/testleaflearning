package week1.day2.classroom.string;

public class CharOccurance {
	
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
			
			
			// declare and initialize a variable count to store the number of occurrences
			String str = "welcome to chennai";
			char s='c';
			int count=0;
			// convert the string into char array

			char a[]=str.toCharArray();
			//get the length of the array
				for (int i = 0; i < str.length(); i++) {
					if (a[i]==s) {
						count++;
					}
					
				}
				System.out.println(count);
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop
			
					
	}

}
