import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StartupTest {

	@Test
	public void arrayCheck() {
		
		int mSumParallel = (Startup.mSum1) + (Startup.mSum2) + (Startup.mSum3) + (Startup.mSum4); 
		assertEquals(mSumParallel, Startup.mSum);
		
	}
	
}
