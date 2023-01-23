import java.io.*;
import java.util.*;

public class Main {	 
	
	static char board[][];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		
		board =new char [n][2*n-1];
		for(int i=0;i<n;i++) {
			Arrays.fill(board[i], ' ');
		}
		recursion(0,n-1,n);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				sb.append(board[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static void recursion(int x, int y, int n) {
		if(n==3) {
			board[x][y] = '*';
			board[x+1][y-1] = board[x+1][y+1] = '*';
			for(int i=0;i<5;i++)
				board[x+2][y-2+i] = '*';
			return;
		}
		recursion(x,y,n/2);
		recursion(x+(n/2), y-(n/2), n/2);
		recursion(x+(n/2), y+(n/2), n/2);
	}
	

}
