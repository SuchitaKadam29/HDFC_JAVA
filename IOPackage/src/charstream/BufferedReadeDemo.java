package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadeDemo {

	public static void main(String[] args) {


		try {
			
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				
					
					System.out.println("Enter amount");
					
					String s1 =		br.readLine();
					
					int  n1 =	Integer.parseInt(s1);
					
					
					System.out.println(n1 + 100);
		
		
		/*
		 * String str = null;
		 * 
		 * System.out.println("Enter your data");
		 * 
		 * while(!(str=br.readLine()).equals("exit")) {
		 * 
		 * System.out.println(str);
		 * 
		 * }
		 */
					
				
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
