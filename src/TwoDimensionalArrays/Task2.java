package TwoDimensionalArrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++) {
            System.out.println("Line - "+"{"+i+"}");
            System.out.print("[");
            for (int j = 0; j < m-1; j++) {
                System.out.print((matrix[i][j] = (int) (Math.random() * (n + m) + 1))+",");
            }
            System.out.println((matrix[i][m-1]=(int) (Math.random() * (n + m) + 1))+"]");
        }
    }
}
