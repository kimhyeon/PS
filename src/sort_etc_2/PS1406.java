package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

// 에디터
// iterator 무엇..??? 
// list.add, list.remove 사용시 시간초과,
// BOJ 최상 답안 - Node 구현해서 처리함...
public class PS1406 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = br.readLine().split("");
		LinkedList<String> list = new LinkedList<String>();
		ListIterator<String> iter = list.listIterator(list.size());
		
		for(String s : strs) {
			iter.add(s);
		}
		int N = Integer.valueOf(br.readLine());
		
		while(N > 0) {
			
			String[] cmd = br.readLine().split(" ");
			
			// L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
			if(cmd[0].equals("L")) {
				if(iter.hasPrevious()) {
					iter.previous();
				}
			}
			
			// D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
			else if(cmd[0].equals("D")) {
				if(iter.hasNext()) {
					iter.next();
				}
			}
			
			// B	커서 왼쪽에 있는 문자를 삭제함 
			else if(cmd[0].equals("B")) {
				
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				
			}
			
			// P $ 	$라는 문자를 커서 왼쪽에 추가함
			else if(cmd[0].equals("P")) {
				iter.add(cmd[1]);
			}
			
			N--;

		}
		
		StringBuilder sb = new StringBuilder();
		for(String s : list) {
			sb.append(s);
		}
		
		System.out.println(sb);
		br.close();
	}
	
}
