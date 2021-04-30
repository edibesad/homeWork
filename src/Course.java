public class Course
{
    int id;
    String name;
    Instructor instructor;
    Student[] enrolledStudent;

    public Course(int id, String name, Instructor instructor, Student[] enrolledStudent)
    {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.enrolledStudent = enrolledStudent;
    }

    public Student[] getEnrolledStudent()
    {
        return enrolledStudent;
    }

    public int getId()
    {
        return id;
    }



    public String getName()
    {
        return name;
    }



    public Instructor getInstructor()
    {
        return instructor;
    }


}
