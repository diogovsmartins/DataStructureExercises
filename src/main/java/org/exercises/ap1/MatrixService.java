package org.exercises.ap1;

import java.util.Objects;

public class MatrixService {

    // method to generate matrix with size equal to the parameters, fill all indexes with random generated numbers
    public Integer[][] generateMatrix(Integer m, Integer n) {
        if (m == null || n == null) {
            throw new IllegalArgumentException("m and n must be not null");
        }
        Integer[][] matrix = new Integer[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    //method to check if the pattern pattern in the parameter is present in the matrix
    public String checkPattern(Integer[][] matrix, Integer[][] pattern) {
        if (matrix == null || matrix == null) {
            throw new IllegalArgumentException("given matrix and pattern must not be null");
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int mPattern = pattern.length;
        int nPattern = pattern[0].length;
        var findStart=System.currentTimeMillis();
        for (int i = 0; i < m - mPattern + 1; i++) {
            for (int j = 0; j < n - nPattern + 1; j++) {
                if (Objects.equals(matrix[i][j], pattern[0][0])) {
                    boolean isPattern = true;
                    for (int k = 0; k < mPattern; k++) {
                        for (int l = 0; l < nPattern; l++) {
                            if (!Objects.equals(matrix[i + k][j + l], pattern[k][l])) {
                                isPattern = false;
                                break;
                            }
                        }
                    }
                    if (isPattern) {
                        var findEnd=System.currentTimeMillis();
                        System.out.println(findStart);
                        System.out.println(findEnd);
                        var findTime=findEnd-findStart;
                        System.out.println(findTime);
                        return String.format("Pattern was found %s miliseconds", findTime);
                    }
                }
            }
        }
        var findEnd=System.currentTimeMillis();
        var findTime=findEnd-findStart;
        return String.format("Pattern was not found, elapsed time %s miliseconds", findTime);
    }




}
