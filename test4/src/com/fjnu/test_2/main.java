package com.fjnu.test_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class main {

	public static void main(String[] args) throws IOException {
		File f1=new File(".\\2.txt");
		int l,m,n;
		l=1;
		m=0;
	    int []numbers = {6,2,1,3,9};
        Random random = new Random();
        int index = random.nextInt(numbers.length);
        n=numbers[index];
	FileWriter fw=new FileWriter(".\\2.txt");
	for(;l<101;l++,m++){
		 index = random.nextInt(numbers.length);
	        n=numbers[index];
	        
	        
	fw.write(l+"   "+m+"   "+n+"   "+"\r\n");
	}
	fw.close();
	}
}


