package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

// https://www.acmicpc.net/problem/10828
public class PS10828 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		
		
		Stack stack = new Stack();
		
		while(N > 0) {
			String str = br.readLine();
			stack.command(str);
			N--;
		}
		
		System.out.println(stack.sb.toString());
		
	}
	
	public static class Stack {
		
		LinkedList<Integer> list;
		
		StringBuilder sb;
		
		Stack() {
			this.list = new LinkedList<>();
			this.sb = new StringBuilder();
		}
		
		public void command(String str) {
			String[] strs = str.split(" ");
			String commad = strs[0];
			
			switch (commad) {
			
				case "push": push(Integer.valueOf(strs[1]));
					break;
					
				case "pop": pop();
					break;
					
				case "size": size();
					break;		
				
				case "empty": empty();
					break;		

				case "top": top();
					break;		
					
				default:
					
					break;
				
			}
			
		}
		
		public void push(int num) {
			list.add(num);
		}
		
		public void pop() {
			if(list.isEmpty()) {
				sb.append("-1\n");
			} else {
				sb.append(list.getLast()+"\n");
				list.removeLast();
			}
		}
		
		public void size() {
			sb.append(list.size()+"\n");
		}
		
		public void empty() {
			if(list.isEmpty()) {
				sb.append("1\n");
			} else {
				sb.append("0\n");
			}
		}
		
		public void top() {
			if(list.isEmpty()) {
				sb.append("-1\n");
			} else {
				sb.append(list.getLast()+"\n");
			}
		}
		
	}

}
