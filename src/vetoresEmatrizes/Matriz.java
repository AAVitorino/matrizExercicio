package vetoresEmatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat[i][j] = input.nextInt();
			}
			
		}
		

		for(int i = 0; i<n;i++) {
			System.out.println(mat[i][i] + " ");
		}
		
input.close();

	}
  
}
