package com.fjnu.test5_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File_test {
	
	public void File_write(File file,String string) throws IOException{
		
	
	
	FileWriter fw =new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(string);
	bw.close();
	fw.close();
	
	}
	
	
	public String File_read(File file) throws IOException{
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String a=new String();
		a=br.readLine();
		br.close();
		fr.close();
		return a;
	}
	
	public void File_copy(File file1,File file2) throws IOException{
	          File_write(file2,File_read(file1));
	         System.out.println(File_read(file2));
	        
		      
		
	}
	

}
