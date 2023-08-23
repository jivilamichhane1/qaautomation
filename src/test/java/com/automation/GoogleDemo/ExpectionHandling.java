package com.automation.GoogleDemo;

import java.io.File;
import java.io.FileInputStream;

public class ExpectionHandling {
	/// error no Exception throw
	// checked and unchecked when before compile or compl
//try and catch
	public static void main(String[] args) {

		try {

			File file = new File("");
			FileInputStream fi = new FileInputStream(file);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			int num = 5;
			int num1 = 0;
			int num2 = num / num1;
			
			if (num < 10)
				throw new Exception ("not valid num");
			System.out.println(num2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//System.out.println("Exception occored can't devided by zero");
		
	}catch(Exception e){
		e.printStackTrace();
	}finally
	{

	}
	}
}
