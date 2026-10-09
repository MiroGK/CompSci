package Oct7;

public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int i = 0;
        int value = start;
        while (value != 1 && start > 0) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = 3 * value + 1;
            }
            i++;
        }
        if (start > 0) {
            return i;
        } else {
            return -1;
        }
    }

    // Read REQ 03
    public int sumDigits(int n) {
        int value = Math.abs(n);
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    // Read REQ 04
    public int reverseDigits(int n) {
        int value = n;
        int reversed = 0;
        while (value != 0) {
            reversed = reversed * 10 + (value % 10);
            value /= 10;
        }
        return reversed;
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        int output = 1;
        while (output < n) {
            output *= 3;
        }
        return output == n;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        int total = 0;
        int i = 1;
        while (total <= limit) {
            total += i;
            i++;
        }
        return total;
        
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        String file = csv;
        String token = "";
        String result = "";
        while (!token.equals(sentinel) && !file.equals("")) {
            int commaIndex = file.indexOf(",");
            if (commaIndex == -1) {
                token = file;
                file = "";
            } else {
                token = file.substring(0, commaIndex);
                file = file.substring(commaIndex + 1);
            }
            if (!token.equals(sentinel)) {
                if (result.length() == 0) {
                    result += token;
                } else {
                    result += " " + token;
                }
            }
        }
        return result;
    }
}
