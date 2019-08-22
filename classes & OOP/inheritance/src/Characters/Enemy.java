package Characters;

class Character 
{
	/* Useful when you have generic code that will be used in another class where it has specific elements.*/
	public int lives = 1;
	public float health = 100;
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
}

public class Enemy extends Character {
	public Enemy()
	{
		lives = 1;
	}
	
	public Enemy(int i)
	{
		lives = i;
	}
}
