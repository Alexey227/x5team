public class Student {

    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship() {

        if (averageMark == 5) {
            System.out.println(firstName + " стипендия = " + 100);
        } else {
            System.out.println(firstName + " стипендия = " + 80);
        }
    }
}


