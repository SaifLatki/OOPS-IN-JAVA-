class Company {
    final String name;
    int num_Employees;
    int num_Depts;

    Company() {
        name = "Pindaris";
    }
    Company(int num_Employees,int num_Depts)
    {
        this();
        this.num_Employees=num_Employees;
        this.num_Depts=num_Depts;
    }
    void display()
    {
        System.out.println("Company Name= "+name+" NO of Employees= "+num_Employees+" No of Departments= "+num_Depts);
    }
}
public class construct2 {
    public static void main(String args[])
    {
        Company c1=new Company(500,5);
        Company c2=new Company(300,4);
        c1.display();
        c2.display();
    }
}
