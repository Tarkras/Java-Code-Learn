package Characters;

public class Enemy {
	/** Public: Can be access from everywhere.
	 *  Protected: Properties can be access within the class where is declared the variable and within a child class and same package.
	 *  Private: Can be access within the class where is declared
	 *  
	 *  If you need to access to some variable or method when you are not in the same package or class depending on the
	 *  modifier (private or protected) you declared a variable method or class you need setters and getters to access it.*/
	
	/* To know more about access see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
	 * In this case I need to make visible for all the project since I will use it on the main because is located
	 * in another package.*/
	
	public int lives;
	private float health = 100; // By default is 100 if is not declared elsewhere. Since is private we need a set and get methods.
	
	// This is a constructor, it is a special method used to initialize objects. See https://www.w3schools.com/java/java_constructors.asp
	public Enemy()
	{
		lives = 1;
	}
	
	public Enemy(int i)
	{
		lives = i;
	}
	
	public void SetHealth(float health)
	{
		this.health = health; // The this keyword is needed to make the reference with the variable health declared at the start.
		/* Since now the health is declared outside the enemy class we need to take the information from where is declared and
		 * then pass it to the health variable. With this way we can make the variable health private but then we will need
		 * a Get method to pass the information of the health where is necesssary.*/
	}
	
	public float GetHealth()
	{
		return health;
	}
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
}
