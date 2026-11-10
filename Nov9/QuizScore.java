package Nov9;

public class QuizScore {
    private String typed;
    
    public QuizScore(String typed) {
        this.typed = typed;
    }

    public String getTyped() {
        return typed;
    }

    public Integer getPoints() {
        return ParseTools.parseOrNull(typed.substring(0, typed.indexOf('/')));
    }

    public Integer getOutOf() {
        return ParseTools.parseOrNull(typed.substring(typed.indexOf("/") + 1, typed.length()));
    }

    public Double percent() {
        if (getOutOf() == null || getPoints() == null) {
            return null;
        }
        return ((double) getPoints() / getOutOf()) * 100;
    }

    public boolean isPerfect() {
        if (getOutOf() == null || getPoints() == null) {
            return false;
        }
        if (getPoints().equals(getOutOf())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sameScoreAs(QuizScore Other) {
        if (Other == null || Other.getOutOf() == null 
        || Other.getPoints() == null || this.getPoints() == null 
        || this.getOutOf() == null) {
            return false;
        }

        if (this.getPoints().equals(Other.getPoints()) 
            && this.getOutOf().equals(Other.getOutOf())) {
            return true;
        } else {
            return false;
        }
    }
}
