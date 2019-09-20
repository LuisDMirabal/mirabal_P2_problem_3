package mirabalp3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		String topics[] = new String[5]; 
		topics[0] = "Food";
		topics[1] = "Competition";
		topics[2] = "School";
		topics[3] = "Family";
		topics[4] = "Music";
		
		int ratings[][] = new int[5][10];
		int averages[] = new int[5];
		
		int i;
		int j;
		int highest = 0;
		int highest_topic = 0;
		int current = 0;
		int lowest = 200001;
		int lowest_topic = 0;
		
		for(i = 0; i < 10; i++)
		{
			for (j = 0; j < 5; j++)
			{
				System.out.print("User " + (i+1) + " rate " + topics[j] + " from 1(least important) to 10(most important): ");
				ratings[j][i] = scnr.nextInt();
				System.out.println("");
			}
			
		}
		
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 10; j++)
			{
				current = current + ratings[i][j];
			}
			
			if(current > highest)
			{
				highest = current;
				highest_topic = i;
			}
			
			if(current < lowest)
			{
				lowest = current;
				lowest_topic = i;
			}
			averages[i] = current/10;
			current = 0;
		}
		
		for(i = 0; i < 5; i++)
		{
			System.out.print(topics[i] + " ");
			
			for (j = 0; j < 10; j++)
			{
				System.out.print(ratings[i][j] + " ");
			}
			System.out.print(averages[i]); 
			System.out.println("");
			
		
		}
		
		System.out.print("The highest scored topic was " + topics[highest_topic] + " at " + highest + " .");
		System.out.print("The lowest scored topic was " + topics[lowest_topic] + " at " + lowest + ".");
		scnr.close();
	}

}
