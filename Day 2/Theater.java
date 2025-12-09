public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity]; // CHECK
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] newRegisteredMembers = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            newRegisteredMembers[i] = registeredMembers[i];
        }
        registeredMembers = newRegisteredMembers;
    }

    public void registerMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return;
            } else {
                increaseCapacity();
            }
        }
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                return;
            }
        }
    }

    public String toString() {
        // == AMC Members ==
        String string = "== " + theaterName + " ==" + "\n" + "";
        for (int i = 0; i < registeredMembers.length; i++) {
            string = string + (i + 1) + ".) " + registeredMembers[i].toString() + "\n";
        }
        return string;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null
                    && registeredMembers[i].getName().equals(member.getName())) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}