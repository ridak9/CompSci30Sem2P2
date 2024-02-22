
package ClassDemos;

import java.io.*;

public class ReadingFromAFileP2Codio {

	
	public static void main(String[] args) 
	{
	   
	    String path = "../Chapter11/src/ClassDemos/practice3.txt";
	    
	    try 
	    {
	      BufferedReader reader = new BufferedReader(new FileReader(path));
	      
	      String currentLine = reader.readLine();
	      
	      while(currentLine != null) 
	      {
	        System.out.println(currentLine);
	        currentLine = reader.readLine();
	      
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
