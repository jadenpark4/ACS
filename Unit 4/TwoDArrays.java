public class TwoDArrays {

    public static void main(String[] args) {
        // Problem 1: Initialize a 2D Array with Zeros
        int[][] array1 = initializeArrayWithZeros(3, 4);

        // Problem 2: Fill a 2D Array with Incremental Numbers
        int[][] array2 = fillArrayWithIncrementalNumbers(3, 3);

        // Problem 3: Diagonal Initialization
        int[][] array3 = diagonalInitialization(4);

        // Add calls to other problem solutions here...
    }

    // Problem 1: Initialize a 2D Array with Zeros
    private static int[][] initializeArrayWithZeros(int rows, int cols) {
        int[][] array = new int[rows][cols];

        // Java initializes int arrays with 0 by default,
        // but we'll be explicit for learning clarity
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 0;
            }
        }

        return array;
    }

    // Problem 2: Fill a 2D Array with Incremental Numbers
    private static int[][] fillArrayWithIncrementalNumbers(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value++;
            }
        }

        return array;
    }

    // Problem 3: Diagonal Initialization
    private static int[][] diagonalInitialization(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // set main diagonal to 1
        }

        return array;
    }
}
