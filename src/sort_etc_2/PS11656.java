package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 접미사 배열
public class PS11656 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < str.length(); i++) {
			list.add(str.substring(i));
		}
		
		Collections.sort(list);
		
		StringBuffer sb = new StringBuffer();
		for(String s : list) {
			sb.append(s).append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}
	
}
