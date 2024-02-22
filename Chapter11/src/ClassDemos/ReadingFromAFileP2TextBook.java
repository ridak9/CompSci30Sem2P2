package ClassDemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromAFileP2TextBook 
{

	public static void main(String[] args) 
	{
		File textFile = new File("../Chapter11/src/ClassDemos/practice3.txt");
		
		FileReader in;
		
		BufferedReader reader;

		String currentLine;
	    
	    try 
	    {
	    	in = new FileReader(textFile);	
		    reader = new BufferedReader(in);
	      
		    currentLine = reader.readLine();
	      
	      while(currentLine != null) 
	      {
	        System.out.println(currentLine);
	        currentLine = reader.readLine();
	      
	      }
	      
	      reader.close();
	      in.close();
	      
	    } 
	    catch (IOException e) 
	    {
	      System.out.println(e);
	    } 
	    finally 
	    {
	      System.out.println("Finished reading a file.");
	    }

	}

}
