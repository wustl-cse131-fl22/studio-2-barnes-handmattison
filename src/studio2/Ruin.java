package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
		System.out.print("startAmount");
		double startAmount = in.nextDouble();
	
		System.out.print("winChance");
		double winChance= in.nextDouble();
			
		System.out.print("winLimit:");
		double winLimit = in.nextDouble();
		
		System.out.print("totalSimulations:");
		int totalSimulations = in.nextInt();
		
		int i = 0;
		int countRuins = 0;
		
		
		double amount = startAmount;
		
		for (i = 1; i < totalSimulations; i++)
		{
			while (amount > 0 && amount < winLimit && i <totalSimulations)
			{
				
				if (Math.random() < winChance)
				{
				amount = amount + 1;
				System.out.println("Balance: " + amount);
				}	
				
				else 
				{
				amount = amount - 1;
				System.out.println("Balance: " + amount);
				}
				
			}
			
			if (amount >= winLimit)
				{
				System.out.println("Day " + i);
				}
			
			if (amount == 0)
				{	
				countRuins ++;
				System.out.println("Day " + i);
				System.out.println("you ruined.");
				System.out.println("Total ruins:" + countRuins);
				amount = startAmount;		 
				}
		
		}
	}
}