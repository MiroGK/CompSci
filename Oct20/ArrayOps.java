package Oct20;

public class ArrayOps {
    
    // Read REQ 02
    public String toText(int[] nums) {
        String output = "[";
        for (int i = 0; i < nums.length; i ++) {
            if (i == nums.length - 1) {
                output += nums[i];
            } else {
                output += nums[i] + ", ";
            }
        }
        return output + "]";
    }

    // Read REQ 03
    public int[] numbersFrom(int start, int end) {
        if (end <= start) {
            return new int[0];
        }
        int[] output = new int[end - start];
        for (int i = 0; i < output.length; i++) {
            output[i] = start + i;
        }
        return output;
    }

    // Read REQ 04
    public double averageLength(String[] words) {
        if (words.length == 0) {
            return 0.0;
        }
        double counter = 0;
        for (String word : words) {
            counter += word.length();
        }
        return counter / words.length;
    }

    // Read REQ 05
    public boolean hasWord(String[] words, String target) {
        for (String word : words) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }

    // Read REQ 06
    public int indexOfLongest(String[] words) {
        if (words.length == 0) {
            return -1;
        }
        int best = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[best].length()) {
                best = i; 
            }
        }
        return best;
    }

    // Read REQ 07
    public boolean isIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Read REQ 08
    public int[] reversed(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums.length - 1 - i];
        }
        return output;
    }

    // Read REQ 09
    public int[] removeAndShift(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = 0;
        return nums;
    }

    // Read REQ 10
    public int[] valuesInRange(int[] nums, int low, int high) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= low && nums[i] <= high) {
                count++;
            }
        }
        int[] values = new int[count];
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= low && nums[i] <= high) {
                values[count2] = nums[i];
                count2++;
            }
        }
        return values;
    }
}
