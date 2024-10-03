package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFileP2 
{

	public static void main(String[] args) 
	{
		//Declaration
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		//Create a file
		textFile = new File("../Chapter11b/src/SkillBuilders/zzz.txt");
		
		if(textFile.exists())
		{
			System.out.println("zzz.txt exists.");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("zzz.txt file created!");
				
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
		}
		
		//Delete the file if user chooses
		System.out.println("Would yo like "
				+ "to (K)eep or (D)elete the file? ");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
		{
			//Delete
			if(textFile.delete())
			{
				System.out.println("File Deleted!");
			}
		}
		else
		{
			System.out.println("File is kept and stays the same ");
		}

	}

}
