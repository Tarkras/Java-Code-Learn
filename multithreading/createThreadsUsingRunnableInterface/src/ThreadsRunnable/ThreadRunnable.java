package ThreadsRunnable;

public class ThreadRunnable  implements Runnable {
	
	private Thread thr;
	
	private String name;
	
	public ThreadRunnable(String name)
	{
		this.name = name;
		System.out.println("The thread called " + name + " is being created.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("The thread called" + name+ " is being run.");
		
		try
		{
			for(int i = 4; i > 0; i--)
			{
				System.out.println("Thread " + name + " " + i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println(name + " is interrupted.");
		}
		
		System.out.println(name + " is stopping");
	}
	
	public void start()
	{
		System.out.println("Starting he thread" + name);
		
		if(thr == null)
		{
			thr = new Thread(this, name);
			thr.start();
			
		}
	}
}
