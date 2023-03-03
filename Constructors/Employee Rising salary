import java.util.Scanner;
class Employee {
    String firstName;
    String lastName;
    double monthSalary;

    Employee(String firstName,String lastName,double monthSalary)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthSalary=monthSalary;
    }
    void setData(String firstName,String lastName, double monthSalary)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthSalary=monthSalary;
        if(monthSalary<0)
        {
            this.monthSalary=0.0;
        }
    }
    void getData (String firstName,String lastName,double monthSalary)
    {
        System.out.println("Enter the first Name of Employee: ");
        Scanner sc=new Scanner(System.in);
       firstName=sc.nextLine();
        System.out.println("Enter the last Name of Employee: ");
        lastName=sc.nextLine();
        System.out.println("Enter the Monthly Salary: ");
        monthSalary=sc.nextDouble();
    }
    void yearlySalary()
    {
        double yearSal=monthSalary*12;
        System.out.println("Yearly Salary is= "+yearSal);
    }
    void display()
    {
        System.out.println("full Name: "+firstName+" "+lastName+"\nMonthly Salary: "+monthSalary);
        yearlySalary();
        double riseSalary=(((monthSalary*12)*0.1)+(monthSalary*12));
        System.out.println("Increased Salary by 10 Percent: "+riseSalary);
    }

}

public class construct3 {
    public static void main (String args[])
    {
        Employee e1=new Employee("Ali","Ahmed",100.0);
        Employee e2=new Employee("Wasif","Ali",200.0);

        e1.display();
        e2.display();

    }
}
