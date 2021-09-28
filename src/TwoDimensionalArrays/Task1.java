package TwoDimensionalArrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] matrix1=new int[n][m];
        int[][] matrix2=new int[n][m];
        System.out.println("Matrix1:");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = (int) (Math.random() * (n+m) + 1);
                matrix2[i][j] = (int) (Math.random() * (n+m) + 1);
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        };
        long[][] matrix3=new long[n][m];
        System.out.println("The sum of Matrix1 & Matrix2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

