package Characters;

/** Interfaces is another way to achieve abstraction and like in the abstract classes an interface cannot be used to create
 *  an object, you need to create another class of the interface created. 
 *  It is used to group related methods with empty bodies.
 *  
 *   You can use multiple interfaces in order to have multiple superclass inheritance for one class.
 *   
 *   See https://www.w3schools.com/java/java_interface.asp*/
public interface Characters {
	
	public void ReduceHealth(int damage);
	
}
