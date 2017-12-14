package com.fjnu.test5_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class file_type_difference {
	public static long forJava(File f1,File f2) throws Exception{
		long startTime=System.currentTimeMillis(); 
		  int length=2097152;
		  FileInputStream in=new FileInputStream(f1);
		  FileOutputStream out=new FileOutputStream(f2);
		  byte[] buffer=new byte[length];
		  while(true){
		   int ins=in.read(buffer);
		   if(ins==-1){
		    in.close();
		    out.flush();
		    out.close();
		    long endTime=System.currentTimeMillis();
		    return (endTime-startTime);
		   }else
		    out.write(buffer,0,ins);
		  }
		 }
	
	
	
	
}
