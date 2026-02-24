import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        // Row minimums
        int[] rowMin = new int[row];
        Arrays.fill(rowMin, Integer.MAX_VALUE);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
            }
        }

        // Column maximums
        int[] colMax = new int[col];
        Arrays.fill(colMax, Integer.MIN_VALUE);

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Check lucky numbers
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}