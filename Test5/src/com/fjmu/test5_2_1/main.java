package com.fjmu.test5_2_1;

import java.io.File;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		file_catalog a=new file_catalog();
		
		a.get_all_file(a.get_root_calalog());
		a.put();
		System.out.println("–¥»Î≥…π¶");

	}

}
