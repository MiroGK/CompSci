public class Phrase {

    private String text;

    public Phrase(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }

    // Read REQ 03
    public String reversed() {
        String output = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            output += text.charAt(i);
        }
        return output;
    }

    // Read REQ 04
    public int countChar(char target) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                counter++;
            }
        }
        return counter;
    }

    // Read REQ 05
    public boolean isAllDigits() {
        int counter = 0;
        boolean result = false;
        for(int i = 0; i < text.length() && !text.equals(""); i++) {
            if ((int)text.charAt(i) >= 48 && (int)text.charAt(i) <= 57) {
                counter++;
                // cast each character into an ASCII #, then check if betweeen 48-57 then number
            }
        }
        if (!text.equals("")) {
            result = (counter == text.length()) ? true: false; // needs a result
        } else {
            result = false;
        }
        return result;
    }

    // Read REQ 06
    public int countAdjacentPairs() {
        int counter = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                counter++;
            }
        }
        return counter;
    }

    // Read REQ 07
    public int countOccurrences(String target) {
        int counter = 0;
        for (int i = 0; i <= text.length() - target.length(); i++) {
            if (text.substring(i, i + target.length()).equals(target)) {
                counter ++;
            }
        }
        return counter;
    }

    // Read REQ 08
    public String capitalizeWords() {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i + 1);
            if (i == 0 || text.charAt(i - 1) == ' ') {
                result += letter.toUpperCase();
            } else {
                result += letter;
            }
            // System.out.print(letter);
            // result += text.substring(text.indexOf("") + 1);
            // if (i == text.indexOf(" ") + 1) {
            //     result += text.substring(i, i+1).toUpperCase();
            // }
        }
        return result;
    }

    // Read REQ 09
    public boolean isPalindrome() {
        String output = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            output += text.charAt(i);
        }
        if (output.toLowerCase().equals(text.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

}
