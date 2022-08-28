public class Aspirant extends Student {
    String Nwork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String Nwork) {
        super(firstName, lastName, group, averageMark);
        this.Nwork = Nwork;
    }

    @Override
    double getScholarship() {
        if (averageMark==5)
        {System.out.println("Стипендия 200");}
        else
        {System.out.println("Стипендия 180");}

        return (averageMark);
    }
}
