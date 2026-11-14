// REQ 02: answer after REQ 01
/*
 * 1. new StudentRecord("Dana Lee") runs a constructor whose only line
 *    is this(name, new int[0]). Which constructor's body finishes
 *    first? Why does only the two-parameter constructor need to set
 *    name and scores?
 *    Answer:
 *
 * 2. StudentRecord will have both getAverage() and
 *    getAverage(int first, int last). Why does Java allow two methods
 *    with the same name? Why would it reject a third method,
 *    public int getAverage()?
 *    Answer:
 */
public class CourseTester {
    public static void main(String[] args) {
        StudentRecord dana = new StudentRecord("Dana Lee");
        StudentRecord sam = new StudentRecord("Sam Ortiz", null);
        StudentRecord hana = new StudentRecord("Hana Ito", new int[] {88, 90, 95});
        Course art = new Course("Art", new StudentRecord[] {dana, sam, hana});
        System.out.print(art);
        System.out.println(art.findBestStudent());
        System.out.println(hana.getAverage());
        System.out.println(dana.getAverage());
        
        // StudentRecord john = new StudentRecord("John Doe", new int[] { 80, 90, 100, 95 });
        // System.out.println("john.getName() (expect John Doe): " + john.getName());
        // StudentRecord dana = new StudentRecord("Dana Lee");
        // System.out.println("dana.getScores().length (expect 0): " + dana.getScores().length);
    }
}
