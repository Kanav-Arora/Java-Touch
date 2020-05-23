package array;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the desired number of rows in array");
		int nrow = sc.nextInt();
		System.out.println("Type the desired number of columns in array");
		int ncol = sc.nextInt();
		
		int A[][] = new int[nrow][ncol];
		int B[][] = new int[nrow][ncol];
		
//		int c[][] = a[][]+b[][];
		
		System.out.println("Enter array A");
		for(int i =0; i<nrow; i++)
		{
			for(int j =0; j<ncol; j++)
			{
				System.out.println("Type entry for " + i + " , " + j );
				int a = sc.nextInt();
				A[i][j] = a;
			}
		}
		
		
		System.out.println("Enter array B");
		for(int i =0; i<nrow; i++)
		{
			for(int j =0; j<ncol; j++)
			{
				System.out.println("Type entry for " + i + " , " + j );
				int a = sc.nextInt();
				B[i][j] = a;
			}
		}
		
		
		int C[][] = new int[nrow][ncol];
		for(int i =0; i<nrow; i++)
		{
			for(int j =0; j<ncol; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("Resulted array is :");
		for(int i =0; i<nrow; i++)
		{
			for(int j =0; j<ncol; j++)
			{
				System.out.print(C[i][j] + " | ");
			}
			System.out.println();
		}
		
		
	}

}
