import java.io.*;
import java.util.Scanner;
public class TwoDimRaggedArrayUtility {

	
	/**
	 * Returns the average of the elements in the two dimensional array
	 * @param data
	 * @return the average
	 */
	static double getAverage(double[][] data) {
		double avg = 0;
		double count = 0;
		for(int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				count++;
				avg += data[i][j];
			}
		}
		return (avg / count);
	}
	/**
	 *  Returns the total of the selected column in the two dimensional array index 0 refers to the first column.
	 * @param data
	 * @param col
	 * @return the total
	 */
	static double getColumnTotal(double[][] data, int col) {
		double avg = 0;
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				avg += data[i][col];
		}
		}
		return avg;
	}
	/**
	 * Returns the largest element in the two dimensional array
	 * @param data
	 * @return the largest element
	 */
	static double getHighestInArray(double[][] data) {
		double check = 0;
		for(int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if(check < data[i][j])
					check = data[i][j];
			}
				
		}
		return check;
	}
	/**
	 * Returns the largest element of the selected
	 *  column in the two dimensional array index 0
	 *   refers to the first column.
	 * @param data
	 * @param col
	 * @return the element
	 */
	static double getHighestInColumn(double[][] data, int col) {
		double check = 0;
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if(check <= data[i][col]) {
					check = data[i][col];
				}
			}
		}
		return check;
	}
	/**
	 * Returns index of the largest element of
	 *  the selected column in the two dimensional 
	 *  array index 0 refers to the first column.
	 * @param data
	 * @param col
	 * @return the index
	 */
	static int getHighestInColumnIndex(double[][] data, int col) {
		double check = 0;
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if(check <= data[i][col]) {
					check = data[i][col];
					index = i;
				}
			}
		}
		return index;
	}
	/**
	 * Returns the largest element of the selected 
	 * row in the two dimensional array index 0 refers
	 *  to the first row.
	 * @param data
	 * @param row
	 * @return the element
	 */
	static double getHighestInRow(double[][] data, int row) {
		double check = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
				if(check < data[row][i]) {

					check = data[row][i];
				}
		}
		return check;
	}
	/**
	 * Returns the largest element of the selected row in 
	 * the two dimensional array index 0 refers to the first row.
	 * @param data
	 * @param row
	 * @return the element
	 */
	static int getHighestInRowIndex(double[][] data, int row) {
		double check = 0;
		int index = 0;
		for(int i = 0; i < data[row].length; i++) {
				if(check < data[row][i]) {
					index = i;
					check = data[row][i];
				}
		}
		return index;
	}
	
	/**
	 * Returns the smallest element in the two dimensional array
	 * @param data
	 * @return
	 */
	static double getLowestInArray(double[][] data) {
		double check = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if(check > data[i][j])
					check = data[i][j];
			}
				
		}
		return check;
	}
	/**
	 * Returns the smallest element 
	 * of the selected column in the
	 *  two dimensional array index 0 
	 *  refers to the first column.
	 * @param data
	 * @param col
	 * @return the element
	 */
	static double getLowestInColumn(double[][] data, int col) {
		double check = data[0][col];
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if(check >= data[i][col]) {
					check = data[i][col];
				}
			}
		}
		return check;
	}
	/**
	 * Returns the index of the smallest 
	 * element of the selected column in 
	 * the two dimensional array index 0 
	 * refers to the first column.
	 * @param data
	 * @param col
	 * @return the index
	 */
	static int getLowestInColumnIndex(double[][] data, int col) {
		double check = data[0][col];
		int index = 0;
		
		for(int i = 0; i < data.length; i++) {
			if (col < data[i].length) {
				if(check >= data[i][col]) {
					check = data[i][col];
					index = i;
				}
			}
		}
		return index;
	}
	/**
	 *  Returns the smallest element of the selected 
	 *  row in the two dimensional array index 0 
	 *  refers to the first row.
	 * @param data
	 * @param row
	 * @return the element 
	 */
	static double getLowestInRow(double[][] data, int row) {
		double check = data[row][0];
		for(int i = 0; i < data[row].length; i++) {
				if(check > data[row][i]) {
					check = data[row][i];
				}
		}
		return check;
	}
	/**
	 * Returns the index of the smallest 
	 * element of the selected row in the
	 *  two dimensional array index 0 refers
	 *   to the first row.
	 * @param data
	 * @param row
	 * @return the index
	 */
	static int getLowestInRowIndex(double[][] data, int row) {
		double check = data[row][0];
		int index = 0;
		for(int i = 0; i < data[row].length; i++) {
				if(check > data[row][i]) {
					index = i;
					check = data[row][i];
				}
		}
		return index;
	}
	/**
	 * Returns the total of the selected row in 
	 * the two dimensional array index 0 refers 
	 * to the first row.
	 * @param data
	 * @param row
	 * @return the total
	 */
	static double getRowTotal(double[][] data, int row) {
		double check = 0;
		for(int i = 0; i < data[row].length; i++) {
				check += data[row][i];
			}
		return check;
	}
	/**
	 *Returns the total of all the elements
	 * of the two dimensional array
	 * @param data
	 * @return the total
	 */
	static double getTotal(double[][] data) {
		double sum=0;
		for(int i=0; i<data.length; i++) {
			for(int r=0; r<data[i].length; r++) {
				sum+= data[i][r];
			}
		}
		return sum;
	}
	/**
	 * Reads from a file and returns a ragged array 
	 * of doubles The maximum rows is 10 and the 
	 * maximum columns for each row is 10 Each row 
	 * in the file is separated by a new line Each 
	 * element in the row is separated by a space 
	 * Suggestion: You need to know how many rows 
	 * and how many columns there are for each row 
	 * to create a ragged array.
	 * @param file
	 * @return the file
	 * @throws IOException 
	 */
	static double[][] readFile(File file) throws FileNotFoundException{
		int row = 0;
		int counter = 0;
		Scanner scan = new Scanner(file);
		//counter
		while(scan.hasNextLine()) {
			scan.nextLine();
			counter++;
		}
		
		double[][] array = new double[counter][];
		String[][] data = new String[counter][];
		scan.close();
		scan = new Scanner(file);
		
			while(scan.hasNextLine()) {
				
				data[row] = scan.nextLine().trim().split(" ");
				row++;
				
			}
			for (int i = 0; i< array.length;i++) {
				array[i] = new double[data[i].length];
			}
			
			for (int j = 0; j < array.length;j++) {
				for(int i = 0; i < data[j].length; i++) {
					array[j][i] = Double.parseDouble(data[j][i]);
				}
			}
			
			scan.close();

			return array;
	}
	/**
	 * Writes the ragged array of doubles into the file.
	 * @param data
	 * @param outputFile
	 * @throws FileNotFoundException 
	 */
	static void	writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		
		PrintWriter file = new PrintWriter(outputFile);
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				file.print(data[i][j] + " ");
			}
			file.println();
		}
		file.close();
	}
}
