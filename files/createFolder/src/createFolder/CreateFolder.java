package createFolder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String directory = "C:\\Users\\didac\\Desktop\\Hello";
		File f = new File(directory);
		
		f.mkdirs();
	}

}
