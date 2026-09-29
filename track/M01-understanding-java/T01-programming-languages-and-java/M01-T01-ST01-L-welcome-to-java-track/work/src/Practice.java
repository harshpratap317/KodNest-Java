import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // for (int i = 1; i <= 2; i++) {
        //     Student student = new Student();
        
        Student student1 = new Student();
        student1.id = scanner.nextInt();
        student1.name = scanner.next();
        student1.course = scanner.next();
        student1.javaScore = scanner.nextDouble();


        Student student2 = new Student();
        student2.id = scanner.nextInt();
        student2.name = scanner.next();
        student2.course = scanner.next();
        student2.javaScore = scanner.nextDouble();
        
        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + student1.id);
        System.out.println("Name: " + student1.name);
        System.out.println("Course: " + student1.course);
        System.out.println("Java Score: " + student1.javaScore);


        System.out.println("Student Profile");
        System.out.println("ID: " + student2.id);
        System.out.println("Name: " + student2.name);
        System.out.println("Course: " + student2.course);
        System.out.println("Java Score: " + student2.javaScore);
    }
}