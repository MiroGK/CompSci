package Oct22;

public class LoopRepair {

    // Read REQ 03
    // Bug Found: it was out of bounds, and 
    // it ignored uppercase vowels
    // Variables Watched: count, current, i
    // Method Call That Caught It: when i was 6 right before it
    // crashed, it showed me the operation problem 
    // should be (< not <=)
    public int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                count++;
            }
        }
        return count;
    }

    // Read REQ 04
    // Bug Found: Missing update, the loop would never en
    // Variables Watched: remanings, halvings
    // Method Call That Caught It: it should return halvings 
    // and actually half remaining
    public int halveSteps(int value) {
        int halvings = 0;
        int remaining = value;
        while (remaining > 1) {
            remaining /= 2;
            halvings++;
        }
        return halvings;
    }

    // Read REQ 05
    // Bug Found: 0 was o 
    // Variables Watched:
    // Method Call That Caught It:
    public int countZeros(String digits) {
        int count = 0;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.substring(i, i + 1).equals("0")) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 06
    // Bug Found: index should start at 0,
    // should be >= not > 
    // Variables Watched:
    // Method Call That Caught It:
    public int countCapitals(String text) {
        int capitals = 0;
        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);
            if (letter >= 'A' && letter <= 'Z') {
                capitals++;
            }
        }
        return capitals;
    }

    // Read REQ 07
    // Bug Found: should be sum += number
    // Variables Watched:
    // Method Call That Caught It:
    public int sumTo(int n) {
        int sum = 0;
        for (int number = 1; number <= n; number++) {
            sum += number;
        }
        return sum;
    }

    // Read REQ 08
    // Bug Found: returns stars prematurely
    // Variables Watched:
    // Method Call That Caught It:
    public String buildStars(int count) {
        String stars = "";
        for (int i = 0; i < count; i++) {
            stars += "*";
        }
        return stars;
    }

    // Read REQ 09
    // Bug Found: stops it from resetting count,
    // and makes it > not >= 
    // Variables Watched:
    // Method Call That Caught It:
    public int countAbove(int[] nums, int limit) {
        int count = 0;
        for (int value : nums) {
            if (value > limit) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 10
    // Bug Found: index out of bounds
    // Variables Watched:
    // Method Call That Caught It:
    public String reversed(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}
