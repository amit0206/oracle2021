package com.oracle.algo.numberchallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
        System.out.println("Input Number: ");
        char numberArray[] = input.next().toCharArray();
        boolean validNumber = validateInput(numberArray);
        if(validNumber)
        	getNextLargestValue(numberArray);
        else
        	System.out.println("Invalid Input");
        
        
    }

	static boolean validateInput(char[] numberArray) {
		boolean result = true;
		for (int i=0;i<numberArray.length;i++)
		{
			if(!(numberArray[i]>='0' & numberArray[i]<='9'))
				result = false;
		}
		return result;
	}

	static int getNextLargestValue(char[] numberArray) {
		//Storing length of actual input number
		int length = numberArray.length;
		int i=0;
		for(i=length-1;i>0;i--)
		{
			if(numberArray[i]>numberArray[i-1])
				break;
		}
		if(i==0)
		{
			System.out.println("No possible value");
			return 0;
		}
		else
		{
			//Swap the number with smallest number greater than it
			int swapIndex = i;
			for(int j=i+1;j<length;j++)
			{
				if(numberArray[j]>numberArray[i-1] && numberArray[j]<numberArray[swapIndex])
					swapIndex=j;
			}
			char temp = numberArray[swapIndex];
			numberArray[swapIndex] = numberArray[i-1];
			numberArray[i-1]=temp;
			
			//Sort all the numbers on the right
			Arrays.sort(numberArray,i,length);
			System.out.println("Final Result = "+new String(numberArray));
			return 1;
		}
		
	}
}
