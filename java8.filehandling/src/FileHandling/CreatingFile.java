package FileHandling;

import java.io.FileReader;


public class CreatingFile {

	public static void main(String[] args)  {
		
//		File file=new File("newfileone.txt");
//		
//		try {
//			boolean value=file.createNewFile();
//			
//			if(value) {
//				System.out.println("The file has been created");
//			}
//			else {
//				System.out.println("The file Already Exists");
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

		//Opening the file[FileReader]
		
		char[] array=new char[1000];
		//creating an object
		try {
		FileReader disp=new FileReader("newfileone.txt");
		
		disp.read(array);
		//System.out.println("Data in this file");
		System.out.println(array);
		disp.close();
		
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
