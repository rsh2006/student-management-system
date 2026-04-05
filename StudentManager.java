 import java.util.*;

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
        // student management system java project

    void addStudent(Student s) {
        for(Student st : students) {
            if(st.rollNo == s.rollNo) {
                System.out.println("❌ Roll number already exists!\n");
                return;
            }
        }
        students.add(s);
        System.out.println("✅ Student added successfully!\n");
    }

    void viewStudents() {
        if(students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");
        for(Student s : students) {
            s.display();   // 👈 clean formatted output
        }
    }

    Student searchStudent(int rollNo) {
        for(Student s : students) {
            if(s.rollNo == rollNo) return s;
        }
        return null;
    }

    void deleteStudent(int rollNo) {
        boolean removed = students.removeIf(s -> s.rollNo == rollNo);
        if(removed) System.out.println("✅ Deleted successfully!\n");
        else System.out.println("❌ Student not found!\n");
    }

    void updateStudent(int rollNo, Scanner sc) {
        Student s = searchStudent(rollNo);

        if(s == null) {
            System.out.println("❌ Student not found!\n");
            return;
        }

        System.out.println("\nWhat do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Course");
        System.out.println("4. Marks");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter new name: ");
                s.name = sc.next();
                break;

            case 2:
                System.out.print("Enter new age: ");
                s.age = sc.nextInt();
                break;

            case 3:
                System.out.print("Enter new course: ");
                s.course = sc.next();
                break;

            case 4:
                System.out.print("Enter new marks: ");
                s.marks = sc.nextDouble();
                break;

            default:
                System.out.println("❌ Invalid choice\n");
                return;
        }

        System.out.println("✅ Student updated successfully!\n");
    }
}