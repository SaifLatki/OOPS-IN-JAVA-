import java.util.Scanner;
class EmployeeInfo {
    Scanner sc=new Scanner(System.in);
    int salary;
    int no_of_hours_work;

    void getInfo(int salary, int no_of_hours_work) {

        this.salary = salary;
        this.no_of_hours_work = no_of_hours_work;
    }
    void addsal(){
        if(salary<500){
            salary+=10;
        }
    }
    void addWork(){
        if(no_of_hours_work>6){
            salary+=5;
        }
    }
    void display(){
        System.out.print("Salary: "+salary+ "\nNo of Hours Work: "+no_of_hours_work);
    }




}
public class Task2 {
    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo();
        emp.getInfo(450,7);
        emp.addsal();
        emp.addWork();
        emp.display();

    }
}
