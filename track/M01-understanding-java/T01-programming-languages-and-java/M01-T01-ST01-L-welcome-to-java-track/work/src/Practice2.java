import java.util.Scanner;

class Student {
    int id;
    String name;
    int javaScore;
}

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student st1 = new Student();
        st1.id = scanner.nextInt();
        st1.name = scanner.next();
        st1.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        Student st2 = new Student();
        st2.id = scanner.nextInt();
        st2.name = scanner.next();
        st2.javaScore = scanner.nextInt();

        // Display both records
        System.out.println(st1.id + " - " + st1.name + " - " + st1.javaScore);
        System.out.println(st2.id + " - " + st2.name + " - " + st2.javaScore);

        // Compare both scores and print one result
        if (st1.javaScore > st2.javaScore) {
            System.out.println(st1.name + " has the higher Java score.");
        } else if (st2.javaScore > st1.javaScore) {
            System.out.println(st2.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
    }
}