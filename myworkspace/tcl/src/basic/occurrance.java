package basic;

import java.util.Iterator;

public class occurrance {

	public static void main(String[] args) {
		method1();
		
	}
	public static void method1() {
	
		String str="Navneet Yadav @@@@ #####$ ^^^%%^ 877998766  hjgdd".toLowerCase();
		for (char i=0 ; i<256; i++) {
			int counta=0;
			for (int j=0; j<str.length(); j++) {
				if(i==str.charAt(j)) {
					counta++;	
				}	
			}if(counta>0) {
				System.out.println(i+" = "+counta);	
			}
			
		}
}}
