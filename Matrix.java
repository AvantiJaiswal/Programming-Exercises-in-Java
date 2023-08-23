/*There is a board with 2 rows and N columns, represented by a matrix M. Rows are numbered from 0 to 1 from top to bottom and columns are numbered from 0 to N-1 from left to right. Each cell contains either a 0 or a 1. 
You know that: the sum of integers in the 0-th (upper) row is equal to U, the sum of integers in the 1-st (lower) row is equal to L, the sum of integers in the K-th column is equal to C[K]. Our job is to recover M based on this information.
Write a function: def solution (U, L, C)
That given two integers U,L and an array C of N integers, as described above, returns a string describing the matrix M in the following format. 
The first part of the string should be the description of the upper row (N characters: 0 or 1), then there should be comma (,) and finally there should be the description of the lower row (N characters: 0 or 1.) The output string should not contain any whitespace. 
Given U = 2, L = 3, C=[0, 0, 1, 1, 2], your function should return the word IMPOSSIBLE, because no matrix M satisfies such conditions.
Given U = 2, L = 2, C= [2, 0, 2, 0], function should return 1010, 1010. An efficient algorithm for the following assumptions:
U and L are integers within the range [0..100,000]; N is an integer within the range [1..100,000]; each element of array C is an integer within the range[0..2].*/

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of U and L: ");
        int u = scan.nextInt();
        int l = scan.nextInt();
        System.out.println("Enter the length of C: ");
        int lngth = scan.nextInt();
        System.out.println("Enter the elements of C: ");
        int[] C = new int[lngth];
        for (int k = 0; k < lngth; k++) {
            C[k] = scan.nextInt();
        }
        solution(u, l, C);
    }
    static void solution(int U, int L, int[] C) {
        int n = C.length;
        int ul = U+L;
        int[][] M = new int[2][n];
        for (int i = 0; i < n; i++) {
            if (C[i] == 1) {
                if (U > 0) {
                    M[0][i] = 1;
                    U = U - 1;
                } else if (L > 0) {
                    M[1][i] = 1;
                    L = L - 1;
                }
            } else if (C[i] == 2) {
                if (U > 0) {
                    M[0][i] = 1;
                    U = U - 1;
                }
                if (L > 0) {
                    M[1][i] = 1;
                    L = L - 1;
                }
            }
        }
        int sum = 0;
        for (int p = 0; p < 2; p++) {
            for (int q = 0; q < n; q++) {
                sum = sum + M[p][q];
            }
        }
                if (sum != ul) {
                    System.out.println("IMPOSSIBLE");
                } else {
                    for (int y = 0; y < 2; y++) {
                        for (int z = 0; z < n; z++) {
                            System.out.print(M[y][z]);
                        }
                        if(y == 0)
                            System.out.print(',');
                    }
                }
    }
}
