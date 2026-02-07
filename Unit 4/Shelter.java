import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        // to-do: implement this constructor
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Error: Cannot have rows or columns be less than or equal to 0.");
        }
        this.kennels[rows][cols] = kennels[rows][cols];
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
        if (animal == null) {
            throw new IllegalArgumentException("Error: Animal must not be null.");
        }
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    kennels.row = i;
                } else {
                    kennels.row = i;
                }
            }
        }
    }

    public void add(Dog animal, int row, int col) {
        // to-do: implement this method
        if (animal == null || row <= 0 || col <= 0) {
            throw new IllegalArgumentException("Error: parameters for add() method cannot be null.");
        }
    }

    public void add(ArrayList<Dog> animals) {
        // to-do: implement this method
        if (animals == null) {
            throw new IllegalArgumentException("Error: parameters for add() method cannot be null.");
        }
        for (int i = 0; i < animals.size(); i++) {
            while (kennels.length >= animals.size()) {
                if (kennels[rows] == null || kennels[cols] == null) {
                    animals.get(i).kennel
                } else {
                    System.out.println("No empty kennels.");
                }
            }
            System.out.println("No empty kennels.");
        }
    }

    public Dog adopt(int row, int col) {
        // to-do: implement this method
        if (row <= 0 || col <= 0) {
            throw new IllegalArgumentException("Error: parameters for adopt() method cannot be null.");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (kennels[i][j] == null) {
                    kennels = kennels[i][j];
                }
                if (kennels[i][j] != null) {
                    throw new IllegalArgumentException("Erorr: Cannot adopt dog here.");
                }
            }
        }
        return new Dog();

    }

    public ArrayList<Dog> search(String name) {
        // to-do: implement this method
        if (name == null) {
            throw new IllegalArgumentException("Error: Name cannot be null.");
        }
        int index = 0;
        while (index < kennels.length) {
            for (int i = 0; i < kennels.length; i++) {
                System.out.println("=== List of dogs with the name: " + name + " ===");
                if (name.equals(animals.getname(i))) {
                    System.out.println(animals.getname(i));
                }
            }
        }
        return new ArrayList<Dog>();
    }

    public ArrayList<Dog> search(int age) {
        // to-do: implement this method
        if (age < 0) {
            throw new IllegalArgumentException("Error: Age cannot be negative.");
        }
        int index = 0;
        while (index < kennels.length) {
            for (int i = 0; i < kennels.length; i++) {
                System.out.println("=== List of dogs with the age of " + age + " ===");
                if (age == animals.getAge(i)) {
                    System.out.println(animals.getAge(i));
                }
            }
        }
        return new ArrayList<Dog>();

    }
}
