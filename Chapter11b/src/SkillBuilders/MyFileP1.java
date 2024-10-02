package SkillBuilders;

import java.io.File;
import java.util.Scanner;

public class MyFileP1 
{

	public static void main(String[] args) 
	{
		//Declaration
		File textFile;
		Scanner input = new Scanner(System.in);
		String filename;
		
		//Obtain file name from the user
		System.out.println("Please enter a file name: ");
		filename = input.nextLine();
		
		//Determine if a file exists
		textFile = new File(filename);
		
		if(textFile.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
		
	}

}
