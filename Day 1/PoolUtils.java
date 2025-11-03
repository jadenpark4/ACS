public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        } else if (cleanlinessLevel > 10) {
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        String userNameName = "";
        int randomNum = (int) (Math.random() * 9000) + 1000;
        String trimmedName = name.trim();
        String fixedName = "";
        boolean usedSpace = false;
        for (int i = 0; i < trimmedName.length(); i++) {
            char c = name.charAt(i);
            if (c == ' ') {
                if (!usedSpace) {
                    fixedName += c;
                } else {
                    fixedName += 0;
                }
            } else {
                fixedName += c;
            }
        }
        for (int j = 0; j < fixedName.length(); j++) {
            char d = name.charAt(j);
            if (d == ' ') {
                userNameName += '_';
            } else {
                userNameName += d;
            }
        }
        return "@" + userNameName + "_" + randomNum;
    }

    public static int cleanPool(Pool pool) {
        int oldLevel = pool.getCleanlinessLevel();
        int newLevel = oldLevel + 2;
        if (newLevel > 10) {
            newLevel = 10;
            return newLevel;
        } else {
            return newLevel;
        }
    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        String fixedName = "";
        boolean usedSpace = false;
        for (int i = 0; i < trimmedName.length(); i++) {
            char c = name.charAt(i);
            if (c == ' ') {
                if (!usedSpace) {
                    fixedName += c;
                } else {
                    fixedName += 0;
                }
            } else {
                fixedName += c;
            }
        }
        return fixedName;
    }
}
