package Nov4;

public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int sum = (dogId / 100) + ((dogId / 10) % 10) + (dogId % 10);
        char result = (char) (70 + (sum % 10));
        return result; 
    }

    public static String generateDogTag(int dogId, char dogChar) {
        String result = "" + dogId + dogChar;
        return result;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            int random = (int) (Math.random() * (999 - 100 + 1)) + 100;
            return random;
        }
    }

    public static boolean hasValidTag(Dog dog) {
        if (dog == null) {
            return false;
        }
        int dogId = dog.getDogId();
        String dogTag = generateDogTag(dogId, generateDogChar(dogId));
        if (dogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }

    public static String pickup(Dog dog, String person) {
        if (dog == null) {
            return "There is no dog you bozo!"; 
        } else if (dog.getOwnerName().equals(person)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has fleed the facility.";
        } else {
            return "This person is NOT the dog's owner.";
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        int newAge;
        if (dog.getAge() == 1) {
            newAge = 15;
        } else if (dog.getAge() == 2) {
            newAge = 24;
        } else {
            newAge = 24 + (5 * (dog.getAge() - 2));
        }
        return newAge;
    }

    public static int convertAgeToDogYears(int humanYears) {
        int newAge;
        if (humanYears <= 15) {
            newAge = 1;
        } else if (humanYears <= 24) {
            newAge = 2;
        } else {
            newAge = 2 + ((humanYears - 24) / 5);
        }
        return newAge;
    }

    public static boolean hasName(Dog dog) {
        if (dog == null) {
            return false; 
        }
        if (dog.getName() == null || dog.getName().length() < 1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isValidDog(Dog dog) {
        if (dog == null) {
            return false;
        } else if (hasName(dog) == true 
        && (dog.getAge() >= 0 && dog.getAge() <= 25) 
        && (dog.getDogId() >= 100 && dog.getDogId() <= 999) 
        && hasValidTag(dog) == true) {
            return true;
        } else {
            return false;
        }
    }
}
