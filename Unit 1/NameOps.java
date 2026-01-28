public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(' ');
    }

    public static int indexOfSecondSpace(String name) {
        int firstSpaceIndex = indexOfFirstSpace(name);
        if (firstSpaceIndex == -1) {
            return -1;
        } else {
            return name.indexOf(' ', firstSpaceIndex + 1);
        }
    }

    public static String findFirstName(String name) {
        int firstSpaceIndex = indexOfFirstSpace(name);
        if (firstSpaceIndex == -1) {
            return name;
        } else {
            return name.substring(0, firstSpaceIndex);
        }
    }

    public static String findLastName(String name) {
        int lastSpaceIndex = name.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return "";
        } else {
            return name.substring(lastSpaceIndex + 1);
        }
    }

    public static String findMiddleName(String name) {
        int firstSpaceIndex = indexOfFirstSpace(name);
        int secondSpaceIndex = indexOfSecondSpace(name);
        if (firstSpaceIndex == -1 || secondSpaceIndex == -1) {
            return "";
        } else {
            return name.substring(firstSpaceIndex + 1, secondSpaceIndex);
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        String first = findFirstName(name);
        String middle = findMiddleName(name);
        String last = findLastName(name);

        // Case 1: only one word (no last name)
        if (last.equals("")) {
            return name;
        }

        // Case 2: has first and last name (maybe middle)
        if (middle.equals("")) {
            return last + ", " + first;
        } else {

            // Case 3: has first, middle, and last
            return last + ", " + first + " " + middle.charAt(0) + ".";
        }
    }
}
