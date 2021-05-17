package prelim.personclasses.test;
import prelim.personclasses.Employee;
import prelim.personclasses.Student;

/**
 *
 * @author Vezeveer
 */
public class Testing {
    public static void main(String[] args){

       Employee employee1 = new Employee(2121, 
                                            8, 
                                        27000.0);

       employee1.
       setName("Mario");
       
       employee1.
       setAge(29);

       Student student1 = new Student(1111, 
                                    "BSCS", 
                                    2);

       student1.
       setName("Fido");

       student1.
       setAge(18);

       employee1.printinfo();
       student1.printinfo();
    }
}
