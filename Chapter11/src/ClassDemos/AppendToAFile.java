package ClassDemos;

import java.io.*;

public class AppendToAFile {

	public static void main(String[] args) 
	{


	 
	    String path = "../Chapter11/src/ClassDemos/practice2.txt";
	    try 
	    {
	      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	      String text = "Nothing left to do";
	      writer.write(text);
	      writer.close();
	    } catch (IOException e) {
	      System.out.println(e);
	    } finally {
	      System.out.println("Finished writing to a file.");
	    }
	  

	}

}
