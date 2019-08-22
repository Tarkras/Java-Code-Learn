package characters;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// More methods in https://docs.oracle.com/javase/tutorial/java/data/characters.html
		char c = '\t'; // Tab button.
		
		System.out.println(c + "Hello" + c + "World"); // The tab starts at the end of another tab.
		
		char a = 'b';
		
		// Check if it is a letter.
		System.out.println(Character.isLetter(a)); // Check if it is a letter. If it is returns a true otherwise returns false.
		
		// Check if it is uppercase.
		System.out.println(Character.isUpperCase(a)); // Check if it is an upper case letter. If it is returns a true otherwise returns false.
		
		// From lowwercase to uppercase.
		System.out.println(Character.toUpperCase(a)); // Check if it is a letter. If it is returns a true otherwise returns false.
	}

}
