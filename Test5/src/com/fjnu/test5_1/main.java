package com.fjnu.test5_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		File_test bbb=new File_test();
		File file3=new File("src.txt");
		File file4=new File("dest.txt");
		Scanner aaa=new Scanner(System.in);
		String aa=new String();
		System.out.println("ǰ�����������뵽�ļ����ַ���");
		aa=aaa.nextLine();
		bbb.File_write(file3, aa);
		bbb.File_copy(file3, file4);

	}

}
