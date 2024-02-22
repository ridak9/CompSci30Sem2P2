package ClassDemos;

import java.io.*;

public class ReadingFromAFileTextBook 
{

	public static void main(String[] args) 
	{
		File textFile = new File("../Chapter11/src/ClassDemos/practice2.txt");
		
		FileReader in;
		
		BufferedReader reader;
		
	    
	    try 
	    {
	      in = new FileReader(textFile);	
	      reader = new BufferedReader(in);
	      
	      System.out.println(reader.readLine());
	      
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
