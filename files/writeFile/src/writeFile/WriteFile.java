package writeFile;

import java.io.*;
import java.io.BufferedWriter;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));
		
		/*FileOutputStream is meant for reading streams of raw bytes such as image data.
		 *  For reading streams of characters, consider using FileWriter.
		 *  There are other methods like PrintWriter and OutputStreamWriter,
		 *  PrintWriter offers some additional methods for formatting*/
		System.out.println("Number 0 for FileOutputStream, Number 1 for FileWriter, Number 2 PrintWriter");
		
		String result = reader.readLine();
		
		System.out.println(result);
		int i = Integer.parseInt(result); 
		
		switch(i) {
		case 0:
			// Write a file with FileOutputStream.
			FileWriter1();
			break;
		case 1:
			// Write a file with FileWriter.
			FileWriter2();
			break;
		case 2:
			// Write a file with PrintWriter.
			FileWriter3();
			break;
		default:
			System.out.println("Write a valid number.");
			break;
		}
		
	}
	
	public static void FileWriter1() {
		FileOutputStream fos = null;
		File file;
		String mycontent = "This is my data which needs" + 
				" to be written";
		
		try {
			
			/*With FileOutputStream (Writes bytes to a file) you can use
			 *  DataOutputStream (Write a String to a file)
			 *  and BufferedOutputStream
			 * */
			file = new File("C:\\Users\\didac\\Desktop\\JavaCode\\files\\writeFile\\src\\writeFile.txt");
			fos = new FileOutputStream(file);
			
			/* This logic will check whether the file
			   * exists or not. If the file is not found
			   * at the specified location it would create
			   * a new file*/
			  if (!file.exists()) {
			     file.createNewFile();
			  }

			  /*String content cannot be directly written into
			   * a file. It needs to be converted into bytes
			   */
			  byte[] bytesArray = mycontent.getBytes();
			  fos.write(bytesArray);
			  fos.flush(); // Flushes this output stream and forces any buffered output bytes to be written out. 
		}
		catch (IOException ioe) {
			  ioe.printStackTrace();
		       } 
		       finally {
			  try {
			     if (fos != null) 
			     {
				 fos.close();
			     }
		          } 
			  catch (IOException ioe) {
			     System.out.println("Error in closing the Stream");
			  }
		       }
	}

	public static void FileWriter2() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		File file;
		String[] str = new String[5];
		str[0] = "Prueba1";
		str[1] = "Prueba2";
		str[2] = "Prueba3";
		str[3] = "Prueba4";
		str[4] = "Prueba5";
		
		try {
			file = new File("C:\\Users\\didac\\Desktop\\JavaCode\\files\\writeFile\\src\\writeFile2.txt");
			fw = new FileWriter(file);
			
			/*The BufferedWriter allows to use the method newLine()
			 * It allows to write the information in different lines.
			 * You can write a file without the buffer.*/
			bw = new BufferedWriter(fw);
			
			if (!file.exists()) {
			     file.createNewFile();
			  }
			
			for(int i = 0; i < str.length; i++) {
				bw.write(str[i]);
				bw.newLine();
			}
			bw.flush();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if(fw != null && bw !=null) {
					fw.close();
					bw.close();
				}
			}
			catch(IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}

	public static void FileWriter3() {
		/*With PrintWriter you can easily format the content.*/
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		File file;
		
		try {
			file = new File("C:\\Users\\didac\\Desktop\\JavaCode\\files\\writeFile\\src\\writeFile3.txt");
			
			if(!file.exists()){
				file.createNewFile();
		    }
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("First Line");
			pw.println("Second Line");
			pw.println("Third Line");
			
			pw.close();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if(fw != null && bw !=null) {
					fw.close();
					bw.close();
				}
			}
			catch(IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}
}
