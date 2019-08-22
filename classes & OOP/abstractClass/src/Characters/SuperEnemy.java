package Characters;

public class SuperEnemy extends Character {
	public SuperEnemy()
	{
		this.health = 1000; // It access the variable health in Enemy.java.
	}
	
	public void ReduceHealth(int damage)
	{
		health -=damage;
	}
}
