import java.time.Instant;

public class Main
{
    public static void main(String[] args)
    {
        UserManager userManager = new UserManager();
        CourseManager courseManager = new CourseManager();

        Student student1 = new Student(1,"Edib Esad","Galip");

        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ");

        Student[] javaEnrolledStudents = new Student[]{student1};
        Student[] cSharpEnrolledStudents = new Student[]{student1};

        Course course1 = new Course(1,"Java",instructor1,javaEnrolledStudents);
        Course course2 = new Course(2,"C#",instructor1,cSharpEnrolledStudents);

    }
}
