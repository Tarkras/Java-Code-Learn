package Characters;

public class Enemy extends Character {
	public Enemy()
	{
		lives = 1;
	}
	
	public Enemy(int i)
	{
		lives = i;
	}
	
	public void ReduceHealth(int damage)
	{
		health -=damage;
	}
}
