public class StudentRecord {
    private String name;
    private int[] scores;

    public StudentRecord(String name, int[] scores) {
        this.name = name;
        if (scores == null) {
            this.scores = new int[0];
        } else {
            this.scores = scores;
        }
    }

    public StudentRecord(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber >= scores.length) {
            return -1;
        }
        return scores[testNumber];
    }

    public String toString() {
        String output = name + "'s scores: [";
        for (int i = 0; i < scores.length; i ++) {
            output += scores[i];
            if (i < scores.length - 1) {
                output += ", ";
            }
        }
        return output + "]";
    }

    public double getAverage(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return (double) sum / (last - first + 1);
    }

    public double getAverage() {
        if (scores.length == 0) {
            return 0.0;
        }
        return getAverage(0, scores.length - 1);
    }

    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public double getFinalAverage() {
        if (scores.length == 0) {
            return 0.0;
        }
        if (hasImproved()) {
            return getAverage(scores.length / 2, scores.length - 1);
        } else {
            return getAverage();
        }
    }
}
