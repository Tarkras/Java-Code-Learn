package classesAndOop;

import Characters.Enemy;

public class ClassesAndOop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enemy e1 = new Enemy(10); // Initialize a new enemy. It will call the constructor in the class enemy.
		Enemy e2 = new Enemy();
		Enemy e3 = new Enemy(3);
		
		e1.SetHealth(100);
		e2.SetHealth(50);
		e3.SetHealth(25);
		
		// e1.lives = 10; Since now there is a constructor called Enemy that needs a value of lives it will be not necessary declare here the parameters.
		
		System.out.println(e1.lives);
		System.out.println(e2.lives); // Since I didn't declare the lives it will take the default value in the class Enemy.
		System.out.println(e3.lives);
		
		e2.ReduceHealth(9); // It access the method ReduceHealth in the class enemy.
		
		System.out.println(e1.GetHealth());
		System.out.println(e2.GetHealth());
		System.out.println(e3.GetHealth());
	}

}
