import java.io.*;
import java.util.*;

public class Main {	 
		
	static int n, m;
	static int arr[] = new int[10];
	static boolean isused[] = new boolean [10];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());	

		func(0);
		
		System.out.print(sb);
	}
	
	static void func(int k) {
		if(k == m) {
			for(int i=0;i<m;i++)
				sb.append(arr[i] + " ");
			sb.append("\n");
			return;
		}
		for(int i=1;i<=n;i++) {
			if(k!=0 && arr[k-1] >= i)
				continue;
			if(!isused[i]) {
				isused[i] = true;
				arr[k] = i;
				func(k+1);
				isused[i] = false;
			}
		}
	}

}
