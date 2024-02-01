package ClassDemos;

import java.io.*;

public class AppendToAFileP2 
{

	public static void main(String[] args) 
	{
	    
	    String path = "../Chapter11/src/ClassDemos/practice2.txt";
	    try 
	    {
	      BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
	      
	      String text = "but smile, smile, smile";
	      
	      writer.newLine();
	      writer.write(text);
	      writer.close();
	    } 
	    catch (IOException e) 
	    {
	      System.out.println(e);
	    } 
	    finally 
	    {
	      System.out.println("Finished writing to a file.");
	    }
	    

	}

}
