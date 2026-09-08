package Sep8;

public class ArithmeticExpressions {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Time Breakdown ---");

        int totalSeconds = 7384;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % (hours * 3600)) / 60;
        int seconds = (totalSeconds % ((hours * 3600) + (minutes * 60)));
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        System.out.println("--- Part 2: Triangle Calculator ---");

        double sideA = 6.0;
        double sideB = 8.0;

        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        double area = (sideA * sideB) / 2;
        double perimeter = sideA + sideB + hypotenuse;
        
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Area: " + area );
        System.out.println("Perimeter: " + perimeter);

        System.out.println("--- Part 3: Score Tracker ---");

        int score = 200;
        score += 150;
        score *= 2;
        score -= 50;
        score /= 5;

        System.out.println("Final Score: " + score); 

        System.out.println("--- Part 4: Increment and Absolute Value ---");

        int counter = 10;
        int elevation = -300;

        counter++;
        counter++;
        counter--;

        System.out.println("Counter: " + counter);
        System.out.println("Depth: " + Math.abs(elevation));
    }
}
