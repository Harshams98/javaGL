package FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Createfile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file=new File("newfile.txt");
		
		
		try {
			boolean value=file.createNewFile();
			
		if(value) {
			System.out.println("created");
		}
		else {
			System.out.println("alredy exist");
		}
		
		}catch(Exception e)
		{
		}
		
		
		if(file.delete()) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("alredy deleted");
		}

	}

}
