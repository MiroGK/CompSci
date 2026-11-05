package Nov4;

public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private String dogTag;
    private boolean stillInFacility;

    private static int dogsCreated = 0;

    public Dog() {
        name = "Unnamed";
        ownerName = "Unknown";
        age = 1;
        dogId = 100;
        dogTag = "100G";
        stillInFacility = true;

        dogsCreated++;
    }

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;

        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, 
            PawesomeUtils.generateDogChar(this.dogId));
        this.stillInFacility = true;

        dogsCreated++;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public static int getDogsCreated() {
        return dogsCreated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, 
            PawesomeUtils.generateDogChar(this.dogId));
    }

    public String toString() {
        String output = "This dog " + name + ", aged " + age + 
        ", is owned by " + ownerName + ". \n Is it in the facility? "
        + stillInFacility + ". It's dog tag is " + dogTag;
        return output;
    }

    public boolean equals(Dog other) {
        if (other == null) {
            return false;
        } else if (this.name.equals(other.name) 
            && this.ownerName.equals(other.ownerName) 
            && this.dogTag.equals(other.dogTag) 
            && this.age == other.age 
            && this.stillInFacility == other.stillInFacility) {
            return true; 
        } else {
            return false;
        }
    }
}
