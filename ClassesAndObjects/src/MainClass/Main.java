package MainClass;

import sample.Student;

public class Main {
    public static void main(String[] args) {
//        //Student object
        Student s1 = new Student();
        System.out.println("Before assigning values to object s1: "+s1);

        s1.student_id = 101;
        s1.name = "abc";
        s1.age = 24;
        s1.dob = "23/08/2001";
        s1.yoa = "02/03/2010";
        s1.gender = "male";
        s1.grade = "10 A";
        System.out.println("After assigning values to object s1: "+s1);

        Student s2 = new Student();
        System.out.println("Before assigning values to object s2: "+s2);
//        s2 = s1;
        s2.student_id = 101;
        s2.name = "def";
        s2.age = 24;
        s2.dob = "23/08/2001";
        s2.yoa = "02/03/2010";
        s2.gender = "male";
        s2.grade = "10 A";
        System.out.println("After assigning values to object: "+s2);

        Student s3 = new Student("02/03/2010", 101, "def", "23/08/2001", 24, "male", "10 A");
        System.out.println("After assigning values to object s3: "+s3);

    }
}