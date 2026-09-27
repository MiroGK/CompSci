public class BooleanChecks {

    // Returns false only when it rains and practice is not canceled.
    // to-do: implement isPromiseKept
    public boolean isPromiseKept(boolean isRaining, boolean isCanceled) {
        return ((isRaining && isCanceled) 
        || (!isRaining && !isCanceled) 
        || (!isRaining && isCanceled));
    }

    // Returns true when the order has fries or salad, but not both.
    // to-do: implement hasOneSide
    public boolean hasOneSide(boolean hasFries, boolean hasSalad) {
        return (!(hasFries && hasSalad) && (hasFries || hasSalad));
    }

    // Returns true when at least two of the three officers vote yes.
    // to-do: implement isApproved
    public boolean isApproved(boolean firstVote, boolean secondVote,
            boolean thirdVote) {
        return ((firstVote && secondVote && !thirdVote)
    || (firstVote && !secondVote && thirdVote) 
    || (!firstVote && secondVote && thirdVote)
    || (firstVote && secondVote && thirdVote));
    }

    // Returns true for a leap year in the Gregorian calendar.
    // to-do: implement isLeapYear
    public boolean isLeapYear(int year) {
        return (year % 400 == 0 || 
            (!(year % 100 == 0) && year % 4 == 0));
    }

    // Returns true when value is below low or above high. Both endpoints count as inside.
    // to-do: implement outsideRange
    public boolean outsideRange(int value, int low, int high) {
        return (value < low || value > high);
    }

    // Returns true when d divides n evenly. A divisor of 0 divides nothing.
    // to-do: implement divides
    public boolean divides(int d, int n) {
        return (d != 0 && n % d == 0);
    }

    // Returns true when total / count is at least target. A count of 0 has no average.
    // to-do: implement averageAtLeast
    public boolean averageAtLeast(int total, int count, int target) {
        return (count != 0 && total / count >= target);
    }

    // Returns true when word begins with prefix.
    // to-do: implement hasPrefix
    public boolean hasPrefix(String word, String prefix) {
        return (prefix.length() <= word.length() 
        && word.indexOf(prefix) == 0);
    }
}
