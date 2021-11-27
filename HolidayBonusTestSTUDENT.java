import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestSTUDENT {
	
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		/**
		 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */

		@Test
		public void testCalculateHolidayBonusA() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,500,100,200);
			assertEquals(300.0,result[0],.001);
			assertEquals(400.0,result[1],.001);
			assertEquals(1500.0,result[2],.001);
			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}
		

		/**
		 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as other
		 */

		@Test
		public void testCalculateHolidayBonusB() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,1000,250,500);
			assertEquals(750.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(3000.0,result[2],.001);
			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}

		/**
		 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(22000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 5000, 1000, 2000),.001);
	}
	
	/** 
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(4750.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 1000,250,500),.001);

	}

}