package Characters;

public class SuperEnemy implements Characters {  // Needs the keyword implements with the interface.
	
	private int health = 100;
	private int lives = 1;
	
	public SuperEnemy()
	{
		this.setHealth(1000); // It access the variable health in Enemy.java.
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
