package Oct22;

public class LoopRepairTester {
    public static void main(String[] args) {
        // Uncomment one call at a time, run it, and compare against the table
        // for that method in the assignment. Then add calls of your own.
        LoopRepair repair = new LoopRepair();

        // System.out.println("countVowels(\"banana\") -> " + repair.countVowels("banana"));
        // System.out.println("countVowels(\"Ohio\") -> " + repair.countVowels("Ohio"));

        // Until you repair halveSteps, this call never returns. See REQ 04.
        // System.out.println("halveSteps(8) -> " + repair.halveSteps(8));

        // System.out.println("countZeros(\"1234\") -> " + repair.countZeros("1234"));
        // System.out.println("countZeros(\"100200\") -> " + repair.countZeros("100200"));

        // System.out.println("countCapitals(\"one Big Dog\") -> "
        //         + repair.countCapitals("one Big Dog"));
        // System.out.println("countCapitals(\"Apple Banana\") -> "
        //         + repair.countCapitals("Apple Banana"));

        // System.out.println("sumTo(5) -> " + repair.sumTo(5));
        // System.out.println("sumTo(-3) -> " + repair.sumTo(-3));

        // System.out.println("buildStars(4) -> [" + repair.buildStars(4) + "]");
        // System.out.println("buildStars(-2) -> [" + repair.buildStars(-2) + "]");

        // System.out.println("countAbove({3, 7, 15}, 10) -> "
        //         + repair.countAbove(new int[] {3, 7, 15}, 10));
        // System.out.println("countAbove({11, 12, 13}, 10) -> "
        //         + repair.countAbove(new int[] {11, 12, 13}, 10));

        System.out.println("reversed(\"loops\") -> [" + repair.reversed("loops") + "]");
        System.out.println("reversed(\"\") -> [" + repair.reversed("") + "]");
    }
}
