package sample;

public class Student {
    //Student is entity class
    // attributes or fields of class student
    public int student_id;
    public String name;
    public String dob;
    public int age;

    public Student() {
    }

    public Student(String yoa, int student_id, String name, String dob, int age, String gender, String grade) {
        this.yoa = yoa;
        this.student_id = student_id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    public String gender;
    public String yoa; //year of admission
    public String grade;

    //it prints the objects along with its fields
    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", yoa='" + yoa + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
