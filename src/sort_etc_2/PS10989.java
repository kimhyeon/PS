package sort_etc_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10989

public class PS10989 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		int[] countArray = new int[10001];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.valueOf(bf.readLine());
			countArray[num]++;
		}
		
		
		for(int i = 1; i <= 10000; i++) {
			int count = countArray[i];
			for(int j = 0; j < count; j++) {
				bw.write(i+"\n");
			}
			
		}
		
		bw.flush();
		bw.close();
		
	}
	
	
}
