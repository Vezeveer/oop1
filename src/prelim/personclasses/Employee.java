package prelim.personclasses;
/**
 *
 * @author Vezeveer
 */
public class Employee extends Person{
    private int empId;
    private int yearsOfService;
    private double salary;

    public Employee()
    {
    }

    public Employee(int empId)
    {
        this.empId = empId;
    }
    
    public Employee(int empId, int yearsOfService, double salary)
    {
        this.empId = empId;
        this.yearsOfService = yearsOfService;
        this.salary = salary;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }
    public void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }
    public int getYearsOfService(){
        return yearsOfService;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void printinfo()
    {
        System.out.println("\nEmployee Information " + 
                            "\nName: " + super.getName() +
                            "\nAge: " + super.getAge() + 
                            "\nEmployee Id: " + this.getEmpId() +
                            "\nYears of Service: " + this.getYearsOfService() +
                            "\nSalary: " + this.getSalary()
        );
    }
}
