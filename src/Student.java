public class Student extends User
{
    Course[] enrolledCourses;

    public Student(int id, String firstName, String surname)
    {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Course[] getEnrolledCourses()
    {
        return enrolledCourses;
    }

}
