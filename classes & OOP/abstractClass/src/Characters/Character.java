package Characters;

/** Data abstraction: process of hiding certain details and showing only essential information to the user.
 *  See https://www.w3schools.com/java/java_abstract.asp and https://javatutorial.net/java-abstraction-example */

/* An abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * HEre you can have abstract or regular methods. */
public abstract class Character {
	
	public int lives = 1;
	public float health = 100;
	
	/*public void ReduceHealth(int damage) {
		health -= damage;
	}*/
	
	/* An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
	 *  (inherited from) where you have to override in order to acces it.
	 */
	public abstract void ReduceHealth(int damage);
	
	
}
