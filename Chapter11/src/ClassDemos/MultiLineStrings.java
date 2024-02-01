package ClassDemos;

import java.io.*;

public class MultiLineStrings 
{
	public static void main(String args[]) 
	{
	    //add code below this line
	
	    String path = "../Chapter11/src/ClassDemos/practice1.txt";

	    try 
	    {
	      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	      String text1 = "Hello there";
	      String text2 = "my friend";
	      writer.write(text1);
	      writer.newLine();
	      writer.write(text2);
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
	    //add code above this line 
}
}
