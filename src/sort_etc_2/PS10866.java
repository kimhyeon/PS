package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

// https://www.acmicpc.net/problem/PS10845

public class PS10866 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MDeque deque = new MDeque();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N > 0) {
			String str = br.readLine();
			deque.command(str);
			N--;
		}
		
		deque.printLog();
		
	}
	
	static public class MDeque {

		LinkedList<Integer> list;
		StringBuffer sb;
		
		public MDeque() {
			list = new LinkedList<>();
			sb = new StringBuffer();
		}
		
		public void command(String str) {
			String[] strs = str.split(" ");
			
			switch (strs[0]) {
				case "push_front":
					push_front(Integer.valueOf(strs[1]));
					break;
					
				case "push_back":
					push_back(Integer.valueOf(strs[1]));
					break;	
	
				case "pop_front":
					pop_front();
					break;	
				
				case "pop_back":
					pop_back();
					break;
					
				case "size":
					size();
					break;
					
				case "empty":
					empty();
					break;	
					
				case "front":
					front();
					break;	

				case "back":
					back();
					break;	
					
				default:
					break;
			}
			
		}
		
		private void push_front(int n) {
			list.addFirst(n);
		}
		
		private void push_back(int n) {
			list.addLast(n);
		}
		
		private void pop_front() {
			if(list.isEmpty()) {
				sb.append(-1).append("\n");
			} else {
				sb.append(list.getFirst()).append("\n");
				list.removeFirst();
			}
		}
		
		private void pop_back() {
			if(list.isEmpty()) {
				sb.append(-1).append("\n");
			} else {
				sb.append(list.getLast()).append("\n");
				list.removeLast();
			}
		}
		
		private void size() {
			sb.append(list.size()).append("\n");
		}
		
		private void empty() {
			if(list.isEmpty()) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
		
		private void front() {
			if(list.isEmpty()) {
				sb.append(-1).append("\n");
			} else {
				sb.append(list.getFirst()).append("\n");
			}
		}
		
		private void back() {
			if(list.isEmpty()) {
				sb.append(-1).append("\n");
			} else {
				sb.append(list.getLast()).append("\n");
			}
		}
		
		public void printLog() {
			System.out.println(sb);
		}
		
	}
	
}
