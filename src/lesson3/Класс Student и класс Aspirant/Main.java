public class Main {
    public static void main(String[] args) {
        Student studArr[] = new Student[4];

        studArr[0] = new Student("Alex", "Smit", "A", 5);
        studArr[1] = new Student("Bob", "Marli", "B", 4);
        studArr[2] = new Aspirant("Lev", "Smit", "C", 3);
        studArr[3] = new Aspirant("Kurt", "Roys", "D", 2);

        for (Student student : studArr) {

            student.getScholarship();
        }

        System.out.println();
    }

    }

