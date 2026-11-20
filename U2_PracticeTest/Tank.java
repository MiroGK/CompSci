package U2_PracticeTest;

public class Tank {
    private String tankName;
    private Fish[] residents;

    public Tank(String tankName, Fish[] residents) {
        this.tankName = tankName;
        this.residents = residents;
    }

    public String getTankName() {
        return tankName;
    }

    public Fish[] getResidents() {
        return residents;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    public void setResidents(Fish[] residents) {
        this.residents = residents;
    }

    // REQ 14
    public Fish findByName(String name) {
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] != null && residents[i].getName().equals(name)) {
                return residents[i];
            }
        }
        return null;
    }

    // REQ 15
    public int countSpecies(String species) {
        int amt = 0;
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] != null && residents[i].getSpecies().equals(species)) {
                amt += 1;
            }
        }
        return amt;
    }

    // REQ 16
    public String toString() {
        String output = tankName + " [";
        boolean isFirst = true;
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] != null) {
                if (isFirst) {
                    output += residents[i].getName();
                    isFirst = false;
                } else {
                    output += ", " + residents[i].getName();
                }
            }
        }
        output += "]";
        return output;
    }
}
