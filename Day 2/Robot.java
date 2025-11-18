public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        if (hallwayToClean == null || hallwayToClean.length == 0) {
            hallway = new int[0];
            position = 0;
        } else {
            hallway = new int[hallwayToClean.length];
            for (int i = 0; i < hallwayToClean.length; i++) {
                int value = hallwayToClean[i];
                if (value < 0) {
                    value = 0;
                }
                hallway[i] = value;
            }

            if (startingPosition < 0) {
                position = 0;
            } else if (startingPosition >= hallway.length) {
                position = hallway.length - 1;
            } else {
                position = startingPosition;
            }
        }
        isFacingRight = true;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        if (hallway.length == 0) {
            return true;
        }
        if (isFacingRight && position == hallway.length - 1) {
            return true;
        }
        if (!isFacingRight && position == 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        if (hallway.length == 0) {
            return;
        }

        // pick up one item if present
        if (hallway[position] > 0) {
            hallway[position]--;
            // if there are still items left, stay on this tile
            if (hallway[position] > 0) {
                return;
            }
        }

        // tile is now empty
        if (!isRobotBlockedByWall()) {
            if (isFacingRight) {
                position++;
            } else {
                position--;
            }
        } else {
            // blocked, so just turn around in place
            isFacingRight = !isFacingRight;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        displayState();
        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        int i = 0;
        boolean clear = true;
        while (i < hallway.length && clear) {
            if (hallway[i] != 0) {
                clear = false;
            }
            i++;
        }
        return clear;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        // first line: hallway values
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i]);
            if (i < hallway.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // second line: robot arrow
        for (int i = 0; i < hallway.length; i++) {
            if (i == position) {
                if (isFacingRight) {
                    System.out.print(">");
                } else {
                    System.out.print("<");
                }
            } else {
                System.out.print(" ");
            }
            if (i < hallway.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // extra methods (no comments changed above)

    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setHallway(int[] newHallway) {
        if (newHallway == null || newHallway.length == 0) {
            hallway = new int[0];
            position = 0;
        } else {
            hallway = new int[newHallway.length];
            for (int i = 0; i < newHallway.length; i++) {
                int value = newHallway[i];
                if (value < 0) {
                    value = 0;
                }
                hallway[i] = value;
            }
            if (position >= hallway.length) {
                position = hallway.length - 1;
            }
        }
    }

    public void setPosition(int newPosition) {
        if (hallway == null || hallway.length == 0) {
            position = 0;
        } else if (newPosition < 0) {
            position = 0;
        } else if (newPosition >= hallway.length) {
            position = hallway.length - 1;
        } else {
            position = newPosition;
        }
    }

    public void setFacingRight(boolean facingRight) {
        isFacingRight = facingRight;
    }
}
