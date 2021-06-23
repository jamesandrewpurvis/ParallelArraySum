
public class ThreadOne implements Runnable 
{

	@Override
	public void run() {
		
		Startup.mStartTime = System.nanoTime();
		
		for(int a = 0; a < 50000000; a++)
		{
			Startup.mSum1 += Startup.mRandomNumbers[a];
		}
		
	}
	

}
