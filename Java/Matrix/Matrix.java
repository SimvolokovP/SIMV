package mtx;

public class Matrix {
    private final int[][] matrix;
    public Matrix(int size) {
        matrix = new int[size][size];
        created();
    }

    public void created() {
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix.length; j ++) {
                matrix[i][j] = (int) ((Math.random()) * 5) + 1;
            }
        }
    }

    public int diffOfMatrixDown() {
        int result = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if (i > j) {
                    result -= matrix[i][j];
                }
            }
        }
        return result;
    }

    public int multOfMainDiag() {
        int result = 1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    result *= matrix[i][j];
                }
            }
        }
        return result;
    }
    public int sumOfMatrixUp() {
        int result = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if (i < j) {
                    result += matrix[i][j];
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int[] ints : matrix){
            for (int j = 0; j < matrix.length; j ++) {
                res.append("[").append(ints[j]).append("]").append("\t");
            }
            res.append("\n");
        }
        return res.toString();
    }
    public void print() {
        System.out.println("Current matrix: " + "\n");
        for (int[] ints : matrix){
            for (int j = 0; j < matrix.length; j ++) {
                System.out.printf("[" + ints[j] + "]" + "\t");
            }
            System.out.println("\n");
           }
    }

}
