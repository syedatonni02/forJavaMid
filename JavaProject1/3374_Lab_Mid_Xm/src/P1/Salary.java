package P1;
//Name: Syeda Thamina Tonni
//ID: 04190301430
//Semester: 7
public class Salary extends Discount {
    private int employeeId;
    private double salary;
   public void setSalary(double salary){
        this.salary = salary;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }
}




