package prelim.personclasses;

/**
 *
 * @author Vezeveer
 */
public class Student extends Person{
    private int studId;
    private String course;
    private int year;

    public Student()
    {
        this.course = "No Course";
    }

    public Student(int studId)
    {
        this.studId = studId;
    }

    public Student(int studId, String course, int year)
    {
        this.studId = studId;
        this.course = course;
        this.year = year;
    }

    public void setStudId(int studId){
        this.studId = studId;
    }
    public int getStudId(){
        return studId;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void printinfo()
    {
        System.out.println("\nStudent Information" +
                            "\nName: " + super.getName() +
                            "\nAge: " + super.getAge() +
                            "\nStudent Id: " + this.getStudId() +
                            "\nCourse: " + this.getCourse() +
                            "\nYear: " + this.getYear()
        );

    }
}
