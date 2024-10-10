package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 11;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 90;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 19;
        student3.grade = 100;

        Student[] students = {student1, student2, student3};

        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " +s.grade);
        }
    }
}
