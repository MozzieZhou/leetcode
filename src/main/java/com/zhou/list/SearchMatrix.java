package com.zhou.list;

/**
 * FileName: SearchMatrix
 *
 * @author Mozzie
 * @email: mozzie.zhou@gmail.com
 * @date 2021/5/15 10:25 下午
 * @Description
 */
public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix[1][0]);
//        System.out.println(solution1(matrix, 100));
//        System.out.println(solution2(matrix, 100));
    }

    public static boolean solution1(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] innerMatrix = matrix[i];
            for (int j = 0; j < innerMatrix.length; j++) {
                if (innerMatrix[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solution2(int[][] matrix, int target) {

        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                return true;
            }
        }

        return false;
    }
}
