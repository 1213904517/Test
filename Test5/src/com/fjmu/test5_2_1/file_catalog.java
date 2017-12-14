package com.fjmu.test5_2_1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class file_catalog{
   List<file_information> list=new ArrayList<>();  //总的集合
   List<file_information> list1=new ArrayList<>();//用来存储文件夹的集合
   List<file_information> list2=new ArrayList<>();//用来寸纯文件的集合
   long time=0;
   File filename1;
   int mm=0;
	int nn=0;
    int bbb=0;
	public File get_root_calalog(){
		System.out.println("请输入你想查询的文件根目录");
		Scanner a=new Scanner(System.in);
		String aa=a.nextLine();
		File f=new File(aa);
		return f;
			}
	
/**
 * 
 * @Tittle:
 * @Description:将目录下所有的文件个文件夹名都存到list中
 * @author:15软工三班刘俊新
 * @return:
 * @date 2017年11月13日 下午10:28:53
 */
	
	public void get_all_file(File file){
		
		File []filelist=file.listFiles();
	
		for(int i=0;i<filelist.length;i++){
			
	        if(filelist[i].isDirectory()){
	        	list1.add(new file_information());
	        	list1.get(mm).file_property=0;
	            list1.get(mm).filename=filelist[i].getName();
	            time=filelist[i].lastModified();
	            list1.get(mm).alter_date=new Date(time);
	            list1.get(mm).first_char=list1.get(mm).filename.charAt(0);
	            mm++;
	       if(filelist[i].getName().equals("System Volume Information")==false)
	           get_all_file(filelist[i]);
	        }
	        else {
	        	list2.add(new file_information());
	        list2.get(nn).file_property=1;
	        list2.get(nn).filename=filelist[i].getName();
	        time=filelist[i].lastModified();
	        list2.get(nn).alter_date=new Date(time);
	        list2.get(nn).size=filelist[i].length();
	        list2.get(nn).first_char=list2.get(nn).filename.charAt(0);
	        nn++;
	        }
		}

	}
	/**
	 * 
	 * @Tittle:
	 * @Description:将改目录下所有的文件个文件名通过排序后写入文件
	 * @author:15软工三班刘俊新
	 * @return:空
	 * @date 2017年11月13日 下午10:26:42
	 */
	public void put() throws IOException{
		
	   FileWriter file5=new FileWriter("1.txt");
	    BufferedWriter br=new BufferedWriter(file5);
	    int j =0;
	    int k=0;
	    

		   
		 for(int i=0;i<list1.size();i++)
		for(int m=0;m<list1.size()-1;m++){
			if(i!=list1.size()-1)
		 if(list1.get(i).first_char>list1.get(i+1).first_char)swap1(list1,i,i+1);
			 }
		 
	   for(int i=0;i<list1.size();i++){
		//   if(list1.get(i).file_property==0)
		 br.write("该文件夹的名称是："+list1.get(i).filename.toString()+"            该文件的修改日期是:"+list1.get(i).alter_date.toString()+"           "+"\r\n");  
	   }
	   
	   br.write("\r\n"); 
	   br.write("------------------------------------------以下是文件---------------------------------------------------"); 
	   br.write("\r\n"); 
	   
	   
	   for(int i=0;i<list2.size();i++)
			for(int m=0;m<list2.size()-1;m++){
				if(i!=list2.size()-1)
			 if(list2.get(i).first_char>list2.get(i+1).first_char)swap1(list2,i,i+1);
				 }
	   for(int i=0;i<list2.size();i++){
		  // if(list2.get(i).file_property==1)
		   if(list2.get(i).file_property!=0)br.write("该文件的名称是："+list2.get(i).filename.toString()+"            该文件的修改日期是: "+list2.get(i).alter_date.toString()+"         该文件的大小是:  "+list2.get(i).size+"kb"+"\r\n");
		   }
	   
	   
	   
	
 
   
	   
	   br.close();
	   file5.close();
	   }
	/**
	 * 
	 * @Tittle:list元素交换方法
	 * @Description:
	 * @author:15软工三班刘俊新
	 * @return:空
	 * @date 2017年11月13日 下午10:25:36
	 */
	public static <file_information> void swap1(List<file_information> list, int oldPosition, int newPosition){
	    if(null == list){
	        throw new IllegalStateException("The list can not be empty...");
	    }
	    file_information tempElement = list.get(oldPosition);

	    // 向前移动，前面的元素需要向后移动
	    if(oldPosition < newPosition){
	        for(int i = oldPosition; i < newPosition; i++){
	            list.set(i, list.get(i + 1));
	        }
	        list.set(newPosition, tempElement);
	    }
	    // 向后移动，后面的元素需要向前移动
	    if(oldPosition > newPosition){
	        for(int i = oldPosition; i > newPosition; i--){
	            list.set(i, list.get(i - 1));
	        }
	        list.set(newPosition, tempElement);
	    }
	}
	
}
