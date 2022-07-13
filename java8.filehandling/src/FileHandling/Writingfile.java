package FileHandling;

import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Writingfile {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		//creating a object
		File f=new File("newfileone.txt");
		
		String data="hello this text is from Writingfile.java files";
		//exist or not
		if(f.exists()) {
			System.out.println("The specified file exists\n");
		}
		else {
			System.out.println("the specifed file is not found");
		}
		
		
		
		try {
			//canread
			if(f.canWrite()) {
			System.out.println("file can be written\n");
			FileWriter w=new FileWriter("newfileone.txt");
	
			w.write(data);
			System.out.println("Data stored in txt file\n");
			
			w.close();
			}
			else {
				System.out.println("file cant be written");
			}
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		//getname
		System.out.println("The file name is : "+f.getName());
		//path of the file
		System.out.println("The Path of the specifed file is : "+f.getAbsolutePath());
		System.out.println();
		
		//length
		System.out.println("The total length of the file is : "+f.length()+"\n");
		
		//list of array
		System.out.println("to get the array of the files usong list() : "+f.list());
		
		//creating a directory 
		File create=new File("//home///harsha//newDirectory");
		if(create.mkdir()) {
			System.out.println("Directory created");
			
		}else {
			System.out.println("Directory can't be created");
		}
		
		
	char[] array=new char[1000];
		//creating an object
		try {
		FileReader disp=new FileReader("newfileone.txt");
		
		
	
		
		//can read
		if(f.canRead()) {
			
			System.out.println("the file Can be read\n");
		disp.read(array);
		System.out.println("Data in this file");
		System.out.println(array);
		disp.close();
		}
		else {
			System.out.println("file can't be read");
		}
		
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
