package DP_1;

import java.io.*;

// https://www.acmicpc.net/problem/9095
// [bottom-up]
public class PS9095 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int caseNum = Integer.valueOf(bf.readLine());
		
		int[] cache = new int[12];
		// init
		cache[0] = -1;
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		
		while(caseNum > 0 ) {
			int num = Integer.valueOf(bf.readLine());
			
			if (num == 1) {
				sb.append(cache[1]+"\n");
			} else if (num == 2) {
				sb.append(cache[2]+"\n");
			} else if (num == 3 ){
				sb.append(cache[3]+"\n");
			} else {
				if(cache[num] != 0) {
					sb.append(cache[num]+"\n");
				} else {
					for(int i = 4; i <= num; i++) {
						if(cache[i] == 0) {
							cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
						}
					}
					sb.append(cache[num]+"\n");
				}
			}
			caseNum--;
		}
		System.out.println(sb);
	}

}
