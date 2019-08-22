package standardStreams;

import java.io.*;

public class StandardStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("Enter characters to write, use < for exit.");
		
		File file = new File("C:\\Users\\didac\\Desktop\\JavaCode\\files\\standardStreams\\src\\writeFile.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			if(!file.exists()){
	    	 	file.createNewFile();
	    	  }
			
			char c;
			
			do {
				c = (char) isr.read();
				System.out.println(c);
				bw.write(c);
				bw.newLine();
			} while(c != '<');
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

}
