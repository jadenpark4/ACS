public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun mat1 = new MatrixFun(3, 4);
        System.out.println(mat1);
        int[][] starter = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        MatrixFun mat2 = new MatrixFun(starter);
        System.out.println(mat2);

        MatrixFun mat3 = new MatrixFun();
        System.out.println(mat3);

        // Test equals(MatrixFun)
        System.out.println("mat2 equals mat2: " + mat2.equals(mat2));

        // Test equals(int[][])
        int[][] compare = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        System.out.println("mat2 equals array: " + mat2.equals(compare));

        // Test replaceAll
        mat2.replaceAll(1, 9);
        System.out.println("After replaceAll: (1, 9):");
        System.out.println(mat2);

        // Test swapRow
        mat2.swapRow(0, 1);
        System.out.println("After swapRow(0, 1):");
        System.out.println(mat2);
    }
}
