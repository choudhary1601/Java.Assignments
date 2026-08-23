public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {
        int[] sum = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] += matrix[i][j];
            }
        }

        return sum;
    }

    static int[] columnSums(int[][] matrix) {
        int[] sum = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum[j] += matrix[i][j];
            }
        }

        return sum;
    }

    static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length ||
            first[0].length != second[0].length) {
            return null;
        }

        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {
        if (first[0].length != second.length) {
            return null;
        }

        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
