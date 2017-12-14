package com.fjnu.test5_3;

import java.io.File;

public class main {

	public static void main(String[] args) throws Exception {
		file_type_difference a=new file_type_difference();
		File f1=new File("1.txt");
		File f2=new File("2.txt");
		
		System.out.println(a.forJava(f1, f2)+"ms");
	}

}
