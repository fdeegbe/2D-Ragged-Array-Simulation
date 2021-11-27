
public class HolidayBonus {

	/**
	 * Calculates the holiday bonus for each store
	 * @param data - the two dimensional array of store sales
	 * @param high - bonus for the highest store in a category
	 * @param low - bonus for the lowest store in a category
	 * @param other - bonus for the other stores in a category
	 * @return the holiday bonus array
	 */
	static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {

		double[] array = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			array[i] = 0;
			for (int j = 0; j < data[i].length; j++) {
				if(data[i][j] <= 0) 
					array[i] += 0;
				else if(i == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j))
					array[i] += high;
				else if(i == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j))
					array[i] += low;
				else
					array[i] += other;
				
			}
		}
		return array;
	}
	/**
	 * Calculates the total holiday bonuses
	 * @param data - the two dimensional array of store sales
	 * @param high - bonus for the highest store in a category
	 * @param low - bonus for the lowest store in a category
	 * @param other - bonus for the other stores in a category
	 * @return the total holiday bonus
	 */
	static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double total = 0;
		double[] array = new double[data.length];
		array = HolidayBonus.calculateHolidayBonus(data, high, low, other);
		for(double d: array) {
			total += d;
		}
		return total;
	}
}

