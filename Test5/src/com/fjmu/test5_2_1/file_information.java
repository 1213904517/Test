package com.fjmu.test5_2_1;

import java.io.File;
import java.sql.Date;

public class file_information {
 public String filename;      //文件夹或文件的名称
 public java.util.Date alter_date;//文件或文件名最后的修改时间
 public int file_property;//用于识别是文件夹还是文件的属性
 public long size;//文件的大小
 public char first_char;//用来排序的标识
 
  
  
  public file_information(){
	  filename="";
	  alter_date=new Date(2017,11,14);
	  file_property=2;
	  size=0;
	  first_char=0;
  }
  
	
	
	
	
}
