public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName) {
        this(courseName, new StudentRecord[0]);
    }

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public String toString() {
        String output = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            output += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return output;
    }

    public String findBestStudent() {
        double highest = enrolledStudents[0].getFinalAverage();
        String student = enrolledStudents[0].getName();
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > highest) {
                highest = enrolledStudents[i].getFinalAverage();
                student = enrolledStudents[i].getName();
            }
        }
        return student;
    }

    public double calculateTestAverage(int testNumber) {
        double sum = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getTestScore(testNumber);
        }
        return (double) sum / enrolledStudents.length;
    }

    public void addStudent(StudentRecord newStudent) {
        if (newStudent == null) {
            return;
        }
        StudentRecord[] bigger = new StudentRecord[enrolledStudents.length + 1];
        for (int i = 0; i < enrolledStudents.length; i++) {
            bigger[i] = enrolledStudents[i];
        }
        bigger[enrolledStudents.length] = newStudent;
        enrolledStudents = bigger;
    }

    public void addStudent(String name, int[] scores) {
        StudentRecord student = new StudentRecord(name, scores);
        addStudent(student);
    }
}
