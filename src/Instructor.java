public class Instructor extends User
{

    Course[] publishedCourses;

    public Instructor(int id, String firstName, String surname)
    {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Course[] getPublishedCourses()
    {
        return publishedCourses;
    }


}
