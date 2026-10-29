package Oct9;

public class PhraseTester {

    public static void main(String[] args) {
        // Uncomment one block at a time as you finish each method.
        // Square brackets around a result make an empty String easy to see.
        // Every block calls its method on these two edge-case phrases.
        Phrase empty = new Phrase("");
        Phrase single = new Phrase("a");

        // System.out.println("=== reversed ===");
        // Phrase stressed = new Phrase("stressed");
        // System.out.println("reversed() on \"stressed\" -> " + stressed.reversed());
        // Phrase java = new Phrase("Java");
        // System.out.println("reversed() on \"Java\" -> " + java.reversed());
        // System.out.println("reversed() on \"\" -> [" + empty.reversed() + "]");
        // System.out.println("reversed() on \"a\" -> " + single.reversed());

        // System.out.println();
        // System.out.println("=== countChar ===");
        // Phrase river = new Phrase("mississippi");
        // Phrase banana = new Phrase("banana");
        // System.out.println("countChar('s') on \"mississippi\" -> " + river.countChar('s'));
        // System.out.println("countChar('a') on \"banana\" -> " + banana.countChar('a'));
        // System.out.println("countChar('a') on \"a\" -> " + single.countChar('a'));

        // System.out.println();
        // System.out.println("=== isAllDigits ===");
        // Phrase digits = new Phrase("40312");
        // Phrase mixed = new Phrase("403a2");
        // Phrase spaced = new Phrase("12 34");
        // System.out.println("isAllDigits() on \"40312\" -> " + digits.isAllDigits());
        // System.out.println("isAllDigits() on \"403a2\" -> " + mixed.isAllDigits());
        // System.out.println("isAllDigits() on \"12 34\" -> " + spaced.isAllDigits());
        // System.out.println("isAllDigits() on \"\" -> " + empty.isAllDigits());
        // System.out.println("isAllDigits() on \"a\" -> " + single.isAllDigits());

        // System.out.println();
        // System.out.println("=== countAdjacentPairs ===");
        // Phrase runs = new Phrase("aabbbc");
        // Phrase bookeeper = new Phrase("bookkeeper");
        // System.out.println("countAdjacentPairs() on \"aabbbc\" -> " + runs.countAdjacentPairs());
        // System.out.println("countAdjacentPairs() on \"bookkeeper\" -> " + bookeeper.countAdjacentPairs());
        // System.out.println("countAdjacentPairs() on \"\" -> " + empty.countAdjacentPairs());
        // System.out.println("countAdjacentPairs() on \"a\" -> " + single.countAdjacentPairs());


        // System.out.println();
        // System.out.println("=== countOccurrences ===");
        // Phrase fours = new Phrase("aaaa");
        // Phrase cat = new Phrase("cat");
        // Phrase banana = new Phrase("banana");
        // System.out.println("countOccurrences(\"aa\") on \"aaaa\" -> "
        //         + fours.countOccurrences("aa"));
        // System.out.println("countOccurrences(\"cats\") on \"cat\" -> "
        //         + cat.countOccurrences("cats"));
        // System.out.println("countOccurrences(\"ana\") on \"banana\" -> "
        //         + banana.countOccurrences("ana"));
        // System.out.println("countOccurrences(\"a\") on \"\" -> " + empty.countOccurrences("a"));
        // System.out.println("countOccurrences(\"a\") on \"a\" -> "
        //         + single.countOccurrences("a"));

        // System.out.println();
        // System.out.println("=== capitalizeWords ===");
        // Phrase greeting = new Phrase("hello world");
        // Phrase spaced = new Phrase("  two   spaces here ");
        // System.out.println("capitalizeWords() on \"hello world\" -> "
        //         + greeting.capitalizeWords());
        // System.out.println("capitalizeWords() on \"  two   spaces here \" -> ["
        //         + spaced.capitalizeWords() + "]");
        // System.out.println("capitalizeWords() on \"\" -> [" + empty.capitalizeWords() + "]");
        // System.out.println("capitalizeWords() on \"a\" -> " + single.capitalizeWords());

        System.out.println();
        System.out.println("=== isPalindrome ===");
        Phrase racecar = new Phrase("racecar");
        Phrase java = new Phrase("java");
        System.out.println("isPalindrome() on \"racecar\" -> " + racecar.isPalindrome());
        System.out.println("isPalindrome() on \"java\" -> " + java.isPalindrome());
        System.out.println("isPalindrome() on \"\" -> " + empty.isPalindrome());
        System.out.println("isPalindrome() on \"a\" -> " + single.isPalindrome());
    }

}
