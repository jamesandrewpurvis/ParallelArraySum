
public class ThreadThree implements Runnable 
{

	@Override
	public void run() {
			
			for(int a = 100000000; a < 150000000; a++)
			{
				Startup.mSum3 += Startup.mRandomNumbers[a];
			}
			
	
		
	}

}
