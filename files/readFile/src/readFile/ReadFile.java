package readFile;

import java.io.*;
import java.io.BufferedReader; // Allows get content from the buffer.
import java.io.IOException;
import java.io.InputStreamReader; // Allows to get inputs, store them in the buffer.

public class ReadFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));
		
		/*FileInputStream is meant for reading streams of raw bytes such as image data.
		 *  For reading streams of characters, consider using FileReader.
		 */
		System.out.println("Number 0 for FileInputStream, Number 1 for FileReader, Number 2 to read a file with FileInputStream without buffer, Number 3 to read a file with FileReader without a buffer.");
		
		String result = reader.readLine();
		
		System.out.println(result);
		int i = Integer.parseInt(result); // String to integer.
		
		switch(i) {
		case 0:
			// Byte Streams with buffer.
			FileReader1();
			break;
		case 1:
			// Character Streams with buffer.
			FileReader2();
			break;
		case 2:
			// Byte Streams without buffer.
			FileReader3();
			break;
		case 3:
			// Character streams without buffer.
			FileReader4();
			break;
		default:
			System.out.println("Write a valid number.");
			break;
		}
	}
	
	public static void FileReader1() {
		// Specify the path of the file.
		File file = new File("C:\\Users\\didac\\Desktop\\JavaCode\\files\\readFile\\src\\readFile\\FileInput.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
				
		// With a try catch I will have the possible errors that occurs if there is no file.
		try {
			//FileInputStream to read the file.
			fis = new FileInputStream(file);
					
			/*Passed the FileInputStream to BufferedInputStream
			 *For Fast read using the buffer array.*/
			bis = new BufferedInputStream(fis);
					
			/*available() method of BufferedInputStream
			 * returns 0 when there are no more bytes
			 * present in the file to be read*/
			int i;
			while((i = bis.read()) != -1) {
				System.out.println((char) i); // Can be characters or integer.
			}
		} catch(FileNotFoundException fnfe)
			{
				System.out.println("The specified file not found" + fnfe);
			}
		  catch(IOException ioe)
		    {
			  	System.out.println("I/O Exception: " + ioe); 
		    }
		  finally
		    {
		        try{
		        	if(bis != null && fis!=null)
		        	{
		        		fis.close();
		        		bis.close();
		        	}      
		         }catch(IOException ioe)
		            {
		            	System.out.println("Error in InputStream close(): " + ioe);
		            }	         
		     }
	}

	public static void FileReader2() {
		// Specify the path of the file.
		File file = new File("C:\\Users\\didac\\Desktop\\JavaCode\\files\\readFile\\src\\readFile\\FileInput.txt");
		BufferedReader br = null;
		FileReader fr = null;
				
		// With a try catch I will have the possible errors that occurs if there is no file.
		try {
			//FileReader to read the file.
			fr = new FileReader(file);
					
			/*Passed the FileReader to BufferedReader
			 *For Fast read using the buffer array.*/
			br = new BufferedReader(fr);
			
			// It will show the different strings inside the file.
			String strLine;
			while((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch(FileNotFoundException fnfe)
			{
				System.out.println("The specified file not found" + fnfe);
			}
		  catch(IOException ioe)
		    {
			  	System.out.println("I/O Exception: " + ioe); 
		    }
		  finally
		    {
		        try{
		        	if(br != null && fr!=null)
		        	{
		        		fr.close();
		        		br.close();
		        	}      
		         }catch(IOException ioe)
		            {
		            	System.out.println("Error in InputStream close(): " + ioe);
		            }	         
		     }
	}

	public static void FileReader3() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\didac\\Desktop\\JavaCode\\files\\readFile\\src\\readFile\\FileInput.txt");
			
			int number;
			while((number = fis.read()) != -1) {
				System.out.println(number);
			}
		} catch(FileNotFoundException fnfe)
		{
			System.out.println("The specified file not found" + fnfe);
		}
	  catch(IOException ioe)
	    {
		  	System.out.println("I/O Exception: " + ioe); 
	    }
	  finally
	    {
	        try{
	        	if( fis!=null)
	        	{
	        		fis.close();
	        	}      
	         }catch(IOException ioe)
	            {
	            	System.out.println("Error in InputStream close(): " + ioe);
	            }	         
	     }
			
		}
	
	public static void FileReader4() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\didac\\Desktop\\JavaCode\\files\\readFile\\src\\readFile\\FileInput.txt");
			
			/*char [] a = new char[50];
		      fr.read(a);   // reads the content to the array
		      
		      for(char c : a) {
		         System.out.println(c);   // prints the characters one by one
		      }*/
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}

		}  catch(FileNotFoundException fnfe)
		{
			System.out.println("The specified file not found" + fnfe);
		}
	  catch(IOException ioe)
	    {
		  	System.out.println("I/O Exception: " + ioe); 
	    }
	  finally
	    {
	        try{
	        	if( fr!=null)
	        	{
	        		fr.close();
	        	}      
	         }catch(IOException ioe)
	            {
	            	System.out.println("Error in InputStream close(): " + ioe);
	            }	         
	     }
	}
}


