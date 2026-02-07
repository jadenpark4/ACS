import java.util.Random;

public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive.");
        }

        matrix = new int[numberOfRows][numberOfCols];
        fillWithRandomNumbers();
    }

    public MatrixFun(int[][] starterMatrix) {
        if (starterMatrix == null || starterMatrix.length == 0) {
            throw new IllegalArgumentException("Starter matrix cannot be null or empty.");
        }
        int cols = starterMatrix[0].length;
        for (int i = 0; i < starterMatrix.length; i++) {
            if (starterMatrix[i].length != cols) {
                System.out.println("Warning: Matrix is not rectangular.");
                throw new IllegalArgumentException("Irregular matrix.");
            }
        }
        matrix = starterMatrix;
    }

    public MatrixFun() {
        this(3, 3);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    private void fillWithRandomNumbers() {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int width = matrix[0].length * 2;
        sb.append("=".repeat(width)).append("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append("=".repeat(width));
        return sb.toString();
    }

    public boolean equals(MatrixFun other) {
        if (other == null)
            return false;
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] other) {
        if (other == null || other.length != matrix.length)
            return false;
        for (int i = 0; i < matrix.length; i++) {
            if (other[i].length != matrix[i].length)
                return false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != other[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Invalid row index.");
        }
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}
