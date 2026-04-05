 class Student {
    int rollNo;
    String name;
    int age;
    String course;
    double marks;
        // student management system java project

    Student(int rollNo, String name, int age, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    String getGrade() {
        if(marks >= 90) return "A";
        else if(marks >= 75) return "B";
        else if(marks >= 60) return "C";
        else if(marks >= 40) return "D";
        else return "F";
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + getGrade());
        System.out.println("----------------------------");
    }
}