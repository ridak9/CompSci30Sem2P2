package ClassDemos;

import java.io.*;

public class ReadingFromAFileTokens 
{

	public static void main(String[] args) 
	{
	    
	    String path = "../Chapter11/src/ClassDemos/practice3.txt";
	    
	    try 
	    {
	      BufferedReader reader = new BufferedReader(new FileReader(path));
	      String line = reader.readLine();
	      String [] tokens = line.split("a");
	      
	      for (String t: tokens) 
	      {
	        System.out.println(t);
	      }
	      
	      reader.close();
	    
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
