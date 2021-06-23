
public class ThreadFour implements Runnable 
{
	public void run()
	{
	for(int a = 150000000; a < 200000000; a++)
	{
		Startup.mSum4 += Startup.mRandomNumbers[a];
	}
	
	}
}
