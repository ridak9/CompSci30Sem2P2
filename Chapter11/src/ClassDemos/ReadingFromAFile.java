package ClassDemos;

import java.io.*;

public class ReadingFromAFile 
{

	public static void main(String[] args) 
	{
	    
	    String path = "../Chapter11/src/ClassDemos/practice2.txt";
	    
	    try 
	    {
	      BufferedReader reader = new BufferedReader(new FileReader(path));
	      System.out.println(reader.readLine());
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
