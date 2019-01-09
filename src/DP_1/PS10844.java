package DP_1;

import java.io.*;

//https://www.acmicpc.net/problem/10844
//[bottom-up]
public class PS10844 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int DIVIDE_NUM = 1000000000;
		int[][] cache = new int[101][10];
		
		// cache[자리수][마지막숫자인 경우의 계단수]
		// ex-> cache[1][2] -> 1 자리의 숫자중 마지막 숫자가 1 로 끝나는 계단수의 갯수
		// ex-> cache[2][0] -> 2 자리의 숫자중 마지막 숫자가 0 로 끝나는 계단수의 갯수
		
		// init
		cache[1][0] = 0;
		for(int i = 1; i <= 9; i++) {
			cache[1][i] = 1;
		}
		
		int num = Integer.parseInt(bf.readLine());
		
		if (num == 1) {
			System.out.println(getSum(cache, num, DIVIDE_NUM));
		} else {
			for(int length = 2; length <= num; length++) {
				
				cache[length][0] = cache[length-1][1] % DIVIDE_NUM; 
				for(int number = 1; number <= 8; number++) {
					cache[length][number] = (cache[length-1][number-1] + cache[length-1][number+1]) % DIVIDE_NUM;
				}
				cache[length][9] = cache[length-1][8] % DIVIDE_NUM; 
				
			}
			System.out.println(getSum(cache, num, DIVIDE_NUM));
		}
	}
	
	public static int getSum(int[][] cache, int num, int DIVIDE_NUM) {
		int result = 0;
		for(int i = 0; i < 10; i++) {
			result = (result + cache[num][i]) % DIVIDE_NUM;
		}
		return result;
	}

}
