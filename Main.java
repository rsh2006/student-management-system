 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        // student management system java project

        while(true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\nEnter details:");
                    System.out.print("RollNo: ");
                    int rollNo = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    System.out.print("Course: ");
                    String course = sc.next();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    sm.addStudent(new Student(rollNo, name, age, course, marks));
                    break;

                case 2:
                    sm.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter RollNo: ");
                    Student s = sm.searchStudent(sc.nextInt());

                    if(s != null) {
                        System.out.println("\n===== STUDENT FOUND =====");
                        s.display();
                    } else {
                        System.out.println("1 Student not found!\n");
                    }
                    break;

                case 4:
                    System.out.print("Enter RollNo: ");
                    sm.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter RollNo to update: ");
                    sm.updateStudent(sc.nextInt(), sc);
                    break;

                case 6:
                    System.out.println("Exiting");
                    return;

                default:
                    System.out.println(" Invalid choice\n");
            }
        }
    }
}