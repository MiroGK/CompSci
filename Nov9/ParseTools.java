package Nov9;

public class ParseTools {
    public static double toDouble(String text) {
        return Double.parseDouble(text);
    }

    public static String describeChar(char value) {
        if (Character.isDigit(value)) {
            return "digit";
        } else if (Character.isLetter(value)) {
            return "letter";
        } else {
            return "other";
        }
    }

    public static boolean isInteger(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }

        int start = 0;
        if (text.charAt(0) == '-') {
            start = 1;
        }

        if (text.charAt(0) != '-' && !Character.isDigit(text.charAt(0))) {
            return false;
        }

        if (start == text.length()) {
            return false;
        }
        
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true; 
    }

    public static Integer parseOrNull(String text) {
        if (isInteger(text)) {
            return Integer.parseInt(text);
        } else {
            return null;
        }
    }

    public static boolean isDecimal(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }

        int start = 0;
        if (text.charAt(0) == '-') {
            start = 1;
        }

        if (text.charAt(0) != '-' && !Character.isDigit(text.charAt(0))) {
            return false;
        }

        if (start == text.length()) {
            return false;
        }
        
        int count = 0;
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i)) && text.charAt(i) != '.') {
                return false;
            }

            if(text.charAt(i) == '.') {
                count++;
            }
        }
        if (count <= 1) {
            return true; 
        } else {
            return false;
        }
    }
}
