package com.fjmu.test5_2_1;

import java.io.File;
import java.sql.Date;

public class file_information {
 public String filename;      //�ļ��л��ļ�������
 public java.util.Date alter_date;//�ļ����ļ��������޸�ʱ��
 public int file_property;//����ʶ�����ļ��л����ļ�������
 public long size;//�ļ��Ĵ�С
 public char first_char;//��������ı�ʶ
 
  
  
  public file_information(){
	  filename="";
	  alter_date=new Date(2017,11,14);
	  file_property=2;
	  size=0;
	  first_char=0;
  }
  
	
	
	
	
}
