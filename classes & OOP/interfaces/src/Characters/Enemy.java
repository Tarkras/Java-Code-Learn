package Characters;

public class Enemy implements Characters { // Needs the keyword implements with the interface.
	
	private int health = 100;
	private int lives = 1;
	
	public Enemy()
	{
		setLives(1);
	}
	
	public Enemy(int i)
	{
		setLives(i);
	}
	
	public void ReduceHealth(int damage)
	{
		setHealth(getHealth() - damage);
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
