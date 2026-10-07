public class Sequences {
    
    // Read REQ 02
    public int sumOfFirst(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        for(int i = start; i <= limit && start <= limit; i++) {
            if (result.length() == 0) {
                result += i;
            } else {
                result += " " + i; 
            }
        }
        return result;
    }

    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        for(int i = start; i <= limit && start <= limit; i += 3) {
            if (result.length() == 0) {
                result += i;
            } else {
                result += " " + i; 
            }
        }
        return result;
    }

    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        for (int i = 1; i <= n && (n >= 0 && factor != 0); i++) {
            if (i % factor == 0) {
                count +=1;
            }
        }
        return count;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        for (int i = 1; i <= times && times > 0; i++) {
            result += s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent && exponent >= 0; i++) {
            result *= base;
        }
        return result;
    }
}
