package ClassDemos;

import java.io.*;

public class ReadAndWriteTwoFiles {


	
	public static void main(String[] args) 
	{
	    
	    String readPath = "../Chapter11/src/ClassDemos/practice3.txt";
	    
	    String writePath = "../Chapter11/src/ClassDemos/practice4.txt";
	    
	    try 
	    {
	      BufferedReader reader = new BufferedReader(new FileReader(readPath));
	      BufferedWriter writer = new BufferedWriter(new FileWriter(writePath));
	      
	      while(reader.ready()) 
	      {
	        writer.write(reader.readLine());
	      }
	      
	      reader.close();
	      writer.close();
	      
	    } catch (IOException e) {
	      System.out.println(e);
	    } finally {
	      System.out.println("Finished reading a file.");
	    }
	    

	}

}
