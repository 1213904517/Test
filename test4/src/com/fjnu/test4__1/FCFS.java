package com.fjnu.test4__1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FCFS {

	
   List<task> list=new ArrayList<>();
   job_queue list1=new job_queue();
   job_queue list2=new job_queue();
   
   boolean m=true;
   double time=0;
   public void fcfs() throws IOException{      //先来先服务算法类
    FileReader f1=new FileReader(".\\1.txt"); 
    BufferedReader bufferedreader=new BufferedReader(f1);
    String file_line="";
    String arry[]=null;
   int i=0;
   
    double k=0;
     while((file_line=bufferedreader.readLine())!=null){
    	arry=file_line.split("   ");
    	list.add(new task());
    	if(i==0)k=0;
    	else k=list.get(i-1).getfinish_time();
    	list.get(i).Add(Double.parseDouble(arry[0]), Double.parseDouble(arry[1]), Double.parseDouble(arry[2]),k);
    	
    	i++;
    	 }
    bufferedreader.close();
    f1.close();
   }
	
   public void Do(){
	    
	    for(int i=0,time=0;i<100;time++)	{
	    	  System.out.println("当前时间是："+ time+"s");
	    	if(list.get(i).start_time==time){
	    		list.get(i).put();
	    		i++;
	    	}
	    else System.out.println("任务"+list.get(i).taskID+"等待中");
	  
	    
   }
   }
   public void two_list(){
	  
	   
	   
	   for(int i=0,time=0;i<100;time++){ 
		   System.out.println("当前时间是"+time+"s");
		       list1.judge(time);
		       if(list1.state==true){
	    	  
	    	   System.out.println("    任务"+list.get(i).taskID+"开始执行"+"        执行队列是：队列1");
	    	   list1.state=false;
	    	   list1.finishtime=time+list.get(i).services_time;
	    	   i++;
	    	  
	       }
		   
		   
		      list2.judge(time);
	          if(list2.state==true){
	    	   
	    	   System.out.println("    任务"+list.get(i).taskID+"开始执行"+"        执行队列是：队列2");
	    	   list2.state=false;
	    	   list2.finishtime=time+list.get(i).services_time;
	    	   i++;
	    	 
	       }
	   
	   }
	  
   }
	}    

