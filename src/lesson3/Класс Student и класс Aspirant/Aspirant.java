public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {

        super(firstName, lastName, group, averageMark);
    }

    public void getScholarship() {

        if (averageMark == 5) {

            System.out.println(firstName + " стипендия = " + 200);
        } else {

            System.out.println(firstName + " стипендия = " + 180);
        }
    }
}
