package test;

import java.util.Scanner;
/**
 * 
* @ClassName: Test
* @Description:实验二 三作业
* @author :15软工三班刘俊新
* @date 2017年10月10日 上午12:22:14
 */

public class Test {

/**
 * 
 * @Tittle:print1
 * @Description:不换行输出函数
 * @author:15软工三班刘俊新
 * @return:Int
 * @date 2017年10月10日 上午12:24:50
 */
	public static void print1(int a){
		System.out.print(a+"该年份是闰年      ");
		
	}
	
	
	/**
	 * 
	 * @Tittle:print2
	 * @Description:换行输出函数
	 * @author:15软工三班刘俊新
	 * @return:Int
	 * @date 2017年10月10日 上午12:26:21
	 */
	public static void print2(int a){
		System.out.print(a+"该年份不是闰年     ");
		
	}
	
	
/**
 * @Tittle:YearType
 * @Description:年份判断函数
 * @author:15软工三班刘俊新
 * @return:无
 * @date 2017年10月10日 上午12:26:55
 */
	public static void YearType(){
		int times=1;
		for(int yearnumber=1990;yearnumber<2008;yearnumber++)
		if((yearnumber%4==0&&yearnumber/100!=0)||yearnumber/400==0){
			
			
			
			print1(yearnumber);
			if(times==2){
				System.out.println();
				times=1;
			}
			else{
				times++;
			}
			
			}
		
		else{
			print2(yearnumber);
			if(times==2){
				System.out.println();
				times=1;
			}
			else{
				times++;
			}
			
			}
	}
	
	



/**
 * 
 * @Tittle:ToGradeScore
 * @Description:分数判断分级函数
 * @author:15软工三班刘俊新
 * @return:无
 * @date 2017年10月10日 上午12:30:52
 */
public static void ToGradeScore(){
 Scanner scanner=new Scanner(System.in);
 System.out.println("please put your score（1-100）：");
 int score=scanner.nextInt();
 if(score<0||score>100)System.out.println("The score is illegal");
 
 switch(score/10){
 case 10:
	System.out.println("Your grade is 优");
	break;
	
 case 9:
	 System.out.println("Your grade is 优");
	 break;
 case 8:
	 System.out.println("Your grade is 良");
	 break;
 case 7:
	 System.out.println("Your grade is 中");
	 break;
 case 6:
	 System.out.println("Your grade is 及格");
	 break;
 default :
	 System.out.println("Your grade is 不及格");
		 
	
 }
	

}
/**
 * 
 * @Tittle:PrintGraph
 * @Description:输出图形函数
 * @author:15软工三班刘俊新
 * @return:无
 * @date 2017年10月10日 下午10:27:09
 */
public static void PrintGraph(){
	
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		System.out.println(" *****");
		System.out.println("  ***");
		System.out.println("   *");
		
	
}
/**
 * 
 * @Tittle:NarcissisticNumber
 * @Description:水仙花数输出函数
 * @author:15软工三班刘俊新
 * @return:无
 * @date 2017年10月10日 下午10:28:14
 */
public static void NarcissisticNumber(){
	for(int a=100;a<1000;a++){
		if((a%10)*(a%10)*(a%10)+(a/10%10)*(a/10%10)*(a/10%10)+(a/100)*(a/100)*(a/100)==a)
			System.out.println(a+"  ");
	}
}



}




