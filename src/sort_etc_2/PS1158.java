package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

// 조세퍼스 순열
public class PS1158 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cmds = br.readLine().split(" ");
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 1; i <= Integer.valueOf(cmds[0]); i++) {
			list.add(i);
		}
		
		int K = Integer.valueOf(cmds[1]);
		
		int index = -1;
		int size = list.size();
		while(size > 1) {
			index = (index + K) % size;
			sb.append(list.get(index)).append(", ");
			list.remove(index);
			index = (index - 1) < 0 ? list.size() - 1 : index - 1;
			size--;
		}
		sb.append(list.get(0)+">");
		
		br.close();
		System.out.println(sb);
		
	}

}
