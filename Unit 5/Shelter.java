import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        // to-do: implement this constructor
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is
     * occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {

        // to-do: implement this method
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                    return;
                }
            }
        }
    }

    public void add(Dog animal, int row, int col) {
        // to-do: implement this method
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        // to-do: implement this method
        for (Dog d : animals) {
            add(d);
        }
    }

    public Dog adopt(int row, int col) {
        // to-do: implement this method
        Dog adopted = kennels[row][col];
        kennels[row][col] = null;
        return adopted;

    }

    public ArrayList<Dog> search(String name) {
        // to-do: implement this method
        ArrayList<Dog> result = new ArrayList<>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] != null && kennels[r][c].getName().equals(name)) {
                    result.add(kennels[r][c]);
                }
            }
        }
        return result;
    }

    public ArrayList<Dog> search(int age) {
        // to-do: implement this method
        ArrayList<Dog> result = new ArrayList<>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] != null && kennels[r][c].getAge() == age) {
                    result.add(kennels[r][c]);
                }
            }
        }
        return result;

    }
}
