package org.example;
import java.io.*;
public class Matriks {
        static void diagonalMat(int[][] matrix, int N)
        {

            int Prima = 0, Sd = 0;

            for (int k = 0; k < N; k++) {
                for (int l = 0; l < N; l++) {
                    if (k == l)
                        Prima += matrix[k][l];
                    if ((k + l) == (N - 1))
                        Sd += matrix[k][l];
                }
            }


            System.out.println(Prima);
            System.out.println(Sd);
        }

        static public void main(String[] args)
        {
            int[][] b = { { 1, 8, 13, 12 },
                    { 14, 11, 2, 7 },
                    { 4, 5, 16, 9 },
                    { 15, 10, 3, 6 } };

            diagonalMat(b, 4);

        }
    }


