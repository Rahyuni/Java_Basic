package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("폴리", 15, 90);
        //System.out.println("student1 주소: " + student1);
        Student student2 = createStudent("라현", 23, 95);
        //System.out.println("student2 주소: " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        //System.out.println("student 주소: " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
