package com.expectionhandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		//create a file

		File file= new File("C:\\Users\\susan\\OneDrive\\Desktop\\My Books\\books.txt");
	if(file.exists()) {
		file.delete();
		file.createNewFile();
		System.out.println(file.isHidden());

		System.out.println(file.createNewFile());
	}
		//file.exists();
		//	file.delete();
	//System.out.println(file.createNewFile());
	//System.out.println(file.exists());

	}

}
