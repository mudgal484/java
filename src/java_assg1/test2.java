package java_assg1;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> inStr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		String temp = sc.nextLine();
		
		while(!temp.contains("XDONE")) {
			inStr.add(temp);
			temp = sc.nextLine();
		}
		
		for(String x : inStr) {
			System.out.println(x);
		}
	}

}
