package com.fjnu.test4__1;

public class job_queue {
   public boolean state;
   public double finishtime;
   
   
   public void job_queue(){
	   state=true;
	   finishtime=0;
   }
   public void judge(double a){
	   if(finishtime==a)state=true;
   }
  
}
