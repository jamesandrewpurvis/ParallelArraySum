import java.util.Random;

public class Startup 
{
	public static int mSum;
	public static int mSum1;
	public static int mSum2;
	public static int mSum3;
	public static int mSum4;
	public static int[] mRandomNumbers;
	public static long mStartTime;
	public static long mEndTime;
	public static Thread mThreadOne;
	public static Thread mThreadTwo;
	public static Thread mThreadThree;
	public static Thread mThreadFour;
	
	public static void main(String[] ags) throws InterruptedException
	{
		Random mRandom = new Random();
		mRandomNumbers = new int[200000000];
		
		for(int a = 0; a < 200000000; a++)
		{
			int mRandomNumber = mRandom.nextInt(11);
			mRandomNumbers[a] = mRandomNumber;
		}
		
		System.out.println("The single thread result is: " + " " + computeSum());
		System.out.println("\n");
		System.out.println("Starting parallel sum test");
		
		mSum = 0;
		
		mThreadOne = new Thread(new ThreadOne());
		mThreadTwo = new Thread(new ThreadTwo());
		mThreadThree = new Thread(new ThreadThree());
	    mThreadFour = new Thread(new ThreadFour());
		
		mThreadOne.start();
		mThreadTwo.start();
		mThreadThree.start();
		mThreadFour.start();
		mThreadOne.join();
		mThreadTwo.join();
		mThreadThree.join();
		mThreadFour.join();
		
		   Startup.mSum += Startup.mSum1 + Startup.mSum2 + Startup.mSum3 + Startup.mSum4;
			
		   Startup.mEndTime = System.nanoTime();
		   
		   System.out.println("This process completed in " + Startup.returnElapsedTime(Startup.mStartTime, Startup.mEndTime));
		   System.out.println("The result of the parallel sum is: " + Startup.mSum);

		
	}
	
	public static int computeSum()
	{
		mStartTime = System.nanoTime();
		
		for(int a = 0; a < 200000000; a++)
		{
			mSum += mRandomNumbers[a];
		}
		
		mEndTime = System.nanoTime();

		System.out.println("It took " + returnElapsedTime(mStartTime, mEndTime) +  " " + "nanoseconds to calculate the result!");
		
		return mSum;
		
		
	}
	
	
	public static long returnElapsedTime(long start, long end)
	{
		return (end - start);
	}

}
