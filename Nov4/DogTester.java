package Nov4;

/*
 * REQ 01: answer both questions after you finish the lab.
 *
 * 1. Work out the tag for dog ID 459 by hand. Show the digit sum,
 *    the character code, and the letter.
 *    Answer:
 *
 * 2. A program builds three dogs and no others, then calls
 *    Dog.getDogsCreated(). What does the call return? What would go
 *    wrong if dogsCreated were not static?
 *    Answer:
 */
public class DogTester {
    public static void main(String[] args) {
        Dog plain = new Dog();
        System.out.println("new Dog() name (expect Unnamed): " + plain.getName());
        System.out.println("new Dog() tag (expect 100G): " + plain.getDogTag());
    }
}
