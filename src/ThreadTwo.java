
public class ThreadTwo implements Runnable 
{

	@Override
	public void run() {
		
		for(int a = 50000000; a < 100000000; a++)
		{
			Startup.mSum2 += Startup.mRandomNumbers[a];

		}
		
	}

}
