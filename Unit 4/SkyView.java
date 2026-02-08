public class SkyView {
    private double[][] view;

    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException();
        }
        if (scanned == null) {
            throw new IllegalArgumentException();
        }
        if (scanned.length > numberOfRows * numberOfCols) {
            throw new IllegalArgumentException();
        }

        view = new double[numberOfRows][numberOfCols];

        int index = 0;

        for (int row = 0; row < numberOfRows; row++) {
            if (row % 2 == 0) {
                // left to right
                for (int col = 0; col < numberOfCols; col++) {
                    view[row][col] = scanned[index++];
                }
            } else {
                // right to left
                for (int col = numberOfCols - 1; col >= 0; col--) {
                    view[row][col] = scanned[index++];
                }
            }
        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String result = "";
        // i = row, j = column
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                result += view[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }
        if (view.length != other.view.length) {
            return false;
        }
        for (int row = 0; row < view.length; row++) {
            if (view[row].length != other.view[row].length) {
                return false;
            }
            for (int col = 0; col < view.length; col++) {
                if (view[row][col] != other.view[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (0 > startRow || startRow > endRow || endRow >= view.length) {
            throw new IllegalArgumentException();
        }
        if (0 > startCol || startCol > endCol || endCol >= view[0].length) {
            throw new IllegalArgumentException();
        }
        double sum = 0.0;
        int count = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                count++;
            }
        }
        return sum / count;
    }

}
