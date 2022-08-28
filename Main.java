public class Main {
    public static void main(String[] args) {
        Student student = new Student("Yu", "Antonov", "2-A", 3);
        Aspirant aspirant = new Aspirant("Alex", "Kitov", "2-B", 3, "History in cinema");
        Student Asus = new Aspirant("Andrey", "Eliseev", "2-C", 5, "Books in new");
        Student[] people = { student, aspirant, Asus };

        for (Student All : people)
            System.out.println(All.getScholarship());
    }
}