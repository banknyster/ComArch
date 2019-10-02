package Default;

import java.util.*;

import java.text.ParseException;

public class MultiplyMatrix {

	private static final int loopCounter = 10000;
	private static final int index = 10000;

	private static int row;
	private static int column;
	
	private static long timeStart;
	private static long timeStop;

	private static Date date;

	private static int[][] targetData = new int[1][index];
	private static int[][] resourceData = new int[index][index];
	
	private static int temp = 0;
	

	public static void main(String[] args) throws ParseException {

		getTimesStart();
		
		storeData();
		
		//System.out.println();
		
		findMultipleProduct();
		
		//System.out.println();
		
		getTimeStop();
		
		getRunTime();

	}

	private static void storeData() {

		Random rand = new Random();

		for (row = 0; row < loopCounter; row++) {

			for (column = 0; column < loopCounter; column++) {
				int i = rand.nextInt(1000);
				int j = rand.nextInt(1000);
				targetData[0][row] = i;
				resourceData[row][column] = j;

			}

		}
		/*
		for (row = 0; row < loopCounter; row++) {
			for (column = 0; column < loopCounter; column++) {
				
				System.out.print(resourceData[row][column]+" ");
			
			}
			System.out.println();
		}
		
		System.out.println();
		for (row = 0; row < loopCounter; row++) {
			System.out.print(targetData[0][row]+" ");
		}*/
		
	}

	private static void findMultipleProduct() {

		
		for (row = 0; row < loopCounter; row++) {
           
            	for (column = 0; column < loopCounter; column++) {
            		
					temp += targetData[0][column] * resourceData[column][row];
					
				}
            	
            	//System.out.print(temp+" ");
				temp=0;
		}
		

	}

	private static void getTimesStart() {
		date = new Date();
		timeStart = date.getTime();
		System.out.println("Start at ( in Milliseconds ) : " + timeStart);

	}

	private static void getTimeStop() {
		date = new Date();
		timeStop = date.getTime();
		System.out.println("Stop at ( in Milliseconds ) : " + timeStop);

	}

	private static void getRunTime() {

		long difference = timeStop - timeStart;
		System.out.println("Time used in seconds: " + difference/1000.0);
	}

}
