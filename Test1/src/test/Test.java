package test;

import java.util.Scanner;
/**
 * 
* @ClassName: Test
* @Description:ʵ��� ����ҵ
* @author :15������������
* @date 2017��10��10�� ����12:22:14
 */

public class Test {

/**
 * 
 * @Tittle:print1
 * @Description:�������������
 * @author:15������������
 * @return:Int
 * @date 2017��10��10�� ����12:24:50
 */
	public static void print1(int a){
		System.out.print(a+"�����������      ");
		
	}
	
	
	/**
	 * 
	 * @Tittle:print2
	 * @Description:�����������
	 * @author:15������������
	 * @return:Int
	 * @date 2017��10��10�� ����12:26:21
	 */
	public static void print2(int a){
		System.out.print(a+"����ݲ�������     ");
		
	}
	
	
/**
 * @Tittle:YearType
 * @Description:����жϺ���
 * @author:15������������
 * @return:��
 * @date 2017��10��10�� ����12:26:55
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
 * @Description:�����жϷּ�����
 * @author:15������������
 * @return:��
 * @date 2017��10��10�� ����12:30:52
 */
public static void ToGradeScore(){
 Scanner scanner=new Scanner(System.in);
 System.out.println("please put your score��1-100����");
 int score=scanner.nextInt();
 if(score<0||score>100)System.out.println("The score is illegal");
 
 switch(score/10){
 case 10:
	System.out.println("Your grade is ��");
	break;
	
 case 9:
	 System.out.println("Your grade is ��");
	 break;
 case 8:
	 System.out.println("Your grade is ��");
	 break;
 case 7:
	 System.out.println("Your grade is ��");
	 break;
 case 6:
	 System.out.println("Your grade is ����");
	 break;
 default :
	 System.out.println("Your grade is ������");
		 
	
 }
	

}
/**
 * 
 * @Tittle:PrintGraph
 * @Description:���ͼ�κ���
 * @author:15������������
 * @return:��
 * @date 2017��10��10�� ����10:27:09
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
 * @Description:ˮ�ɻ����������
 * @author:15������������
 * @return:��
 * @date 2017��10��10�� ����10:28:14
 */
public static void NarcissisticNumber(){
	for(int a=100;a<1000;a++){
		if((a%10)*(a%10)*(a%10)+(a/10%10)*(a/10%10)*(a/10%10)+(a/100)*(a/100)*(a/100)==a)
			System.out.println(a+"  ");
	}
}



}




