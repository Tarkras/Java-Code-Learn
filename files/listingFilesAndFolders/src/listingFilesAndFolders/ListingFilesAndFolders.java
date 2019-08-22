package listingFilesAndFolders;

import java.io.File; 

public class ListingFilesAndFolders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is a way to list folders and files in a direction.
		File file = null;
		String[] paths;
		
		file = new File("C:\\Users\\didac\\Desktop\\Curriculum");
		paths = file.list();
		
		for(String p: paths) {
			System.out.println(p);
		}
	}

}
