package classes_and_objects;

public class Student_use {
    public static void main(String[] args) {
        Student s1 = new Student("Arvind",96);
        s1.rollNumber = 10;

        Student s2 = new Student("Raj",87);
        s1.print();
        System.out.println(s1);
        s2.print();
        System.out.println(s2);
        System.out.println(Student.getNumStudents());



    }
}
