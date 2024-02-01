package ClassDemos;


import java.io.*;
import java.util.StringTokenizer;

public class ReadingFromAFileTokensP2 
{

	public static void main(String[] args) 
	{
	 
	    String path = "../Chapter11/src/ClassDemos/practice3.txt";
	    
	    try 
	    {
	      BufferedReader reader = new BufferedReader(new FileReader(path));
	      String line = reader.readLine();
	      StringTokenizer tokens = new StringTokenizer(line, " ");
	      while (tokens.hasMoreTokens()) 
	      {
	        System.out.println(tokens.nextToken());
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
