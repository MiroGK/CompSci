package U2_PracticeTest;

public class Fish {
    private String name;
    private String species;
    private int[] feedings;

    public Fish(String name, String species) {
        this.name = name;
        this.species = species;
        this.feedings = new int[7];
    }

    // REQ 04
    public Fish(String name) {
        this(name, "Unknown");
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int[] getFeedings() {
        return feedings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setFeedings(int[] feedings) {
        this.feedings = feedings;
    }

    // REQ 05
    public void feed(int day, int grams) {
        feedings[day] += grams;
    }

    // REQ 06
    public int totalFed() {
        int sum = 0;
        for (int i = 0; i < feedings.length; i++) {
            sum += feedings[i];
        }
        return sum;
    }

    // REQ 07
    public int busiestDay() {
        int best = 0;
        for (int i = 1; i < feedings.length; i++) {
            if (feedings[i] > feedings[best]) {
                best = i;
            }
        }
        return best;
    }

    // REQ 08
    public int[] copyFeedings() {
        int[] fake = new int[feedings.length];
        for (int i = 0; i < feedings.length; i++) {
            fake[i] = feedings[i];
        }
        return fake;
    }

    // REQ 09
    public Integer lastFeeding() {
        for (int i = feedings.length - 1; i >= 0; i--) {
            if (feedings[i] > 0) {
                return i;
            }
        }
        return null;
    }

    // REQ 10
    public String toString() {
        return name + " (" + species + ")";
    }

    // REQ 11
    public boolean equals(Fish other) {
        if (other == null) {
            return false;
        } else if (this.name.equals(other.name) 
            && this.species.equals(other.species)) {
            return true;
        } else {
            return false;
        }
    }
}
