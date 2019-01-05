package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11719
public class PS11719 {
	
public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(br.ready()) {
			String str = br.readLine();
			if (str.length() > 100) {
				break;
			}
            
            if(str.isEmpty()) {
              sb.append("\n"); 
            } else {
              sb.append(str).append("\n"); 
            }
		}
		
		System.out.println(sb);
		
	}

}
