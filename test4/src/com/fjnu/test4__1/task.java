package com.fjnu.test4__1;

public class task {
	 public double taskID;  
	 public double arrival_time;  
	 public double services_time;  
	 public double start_time;  
	 public double wait_time;  
	 public double finish_time;  
	 public double turn_around_time;  
	 public double turn_around_time_with_weight;  
	 public int judge_design;
   public task(){
		  taskID=0;  
		  arrival_time=0;  
		  services_time=0;  
		  start_time=0;  
		  wait_time=0;  
		  finish_time=0;  
		  turn_around_time=0;  
		  turn_around_time_with_weight=0;  
		  judge_design=0;
   }
    public void Add(double a,double b,double c,double d){
    	taskID=a;
    	arrival_time=b;
    	services_time=c;
    	start_time=d;
    	wait_time=start_time-arrival_time;
    	finish_time=start_time+services_time;
    	turn_around_time=finish_time-arrival_time;
    	turn_around_time_with_weight=turn_around_time/services_time;
    }
	
    public double getfinish_time(){
		return finish_time;
	}
    public void put(){
    	//System.out.println("任务ID   "+"到达时间         "+"    服务时间"+"          开始时间      "+"      完成时间      "+"        周转时间      "+"             带权周转时间");
       //  System.out.println(taskID+"     "+arrival_time+"     "+services_time+"     "+start_time+"     "+finish_time+"     "+turn_around_time+"     "+turn_around_time_with_weight);
    	System.out.println("任务"+taskID+"执行完毕");  
    }
}
