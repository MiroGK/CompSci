package Sep14;

public class Student {
    private String name;
    private String id;
    private int grade;

    public Student() {
        String name = "";
        String id = "n/a";
        int grade = 0;
    }

    public Student(String newName) {
        this.name = newName;
        this.grade = 10;
        this.id = generateId();

    }

    public Student(String newName, int newGrade) {
        this.name = newName;
        this.grade = newGrade;
        this.id = generateId();
    }

    // getters and setters

    public String getName() {
        return name;      
    } 

    public void setName(String newName) {
        this.name = newName;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        this.id = newId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newGrade) {
        this.grade = newGrade;
    }

    // generating id

    public String generateId() {
        String a = "" + Math.round(((Math.random() * 799) + 100));
        String b = "" + Math.round(((Math.random() * 8999) + 1000));
        String finalId = a + "-" + b;
        return finalId;
    }

    public String toString() {
        return ("This student, " 
        + name + ", has an id of " 
        + id + ", and is in Grade " + grade);
    }

    public boolean equals(Student other) {
        if (id.equals(other.id) && name.equals(other.name) && grade == other.grade) {
            return true;
        } else {
            return false;
        }
    }
}
