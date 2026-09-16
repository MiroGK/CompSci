package Sep14;

public class StudentTester {
    public static void main(String[] args) {
        Student miro = new Student("Miro", 11);
        Student audrey = new Student("Audrey");
        Student patrick = new Student();
        Student haureonioija = new Student();

        patrick.setName("Patrick");
        haureonioija.setName("Haureonioija");

        System.out.println(miro.toString());
        System.out.println(audrey.toString());
        System.out.println(patrick.toString());
        System.out.println(haureonioija.toString());

        System.out.println(audrey);

        System.out.println("Is Miro the same student as Audrey? " + miro.equals(audrey));

        System.out.println("Is Miro the same student as Miro? " + miro.equals(miro));
    }
}
