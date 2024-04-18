class Employee{
    String firstName;
    String lastName;
    String CNIC;

    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    void setCNIC(String CNIC){
        this.CNIC = CNIC;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getCNIC(){
        return CNIC;
    }

    Employee (){
        firstName = lastName = CNIC="";
    }
    Employee (String firstName, String lastName,String CNIC){
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNIC = CNIC;
    }

    public String toString(){
        return firstName + " " + lastName+ " CNIC#" + CNIC;
    }
    public double earnings (){
        return 0.00;
    }
}

class SalariedEmployee extends Employee{
    double weeklySalary ;

    void setWeeklySalary(double weeklySalary){
        this.weeklySalary=weeklySalary;
    }
    double getWeeklySalary(){
        return weeklySalary;
    }

    SalariedEmployee(){
        double weeklySalary =0.00;
    }
    SalariedEmployee(String firstName, String lastName,String CNIC,double weeklySalary){
        super(firstName,lastName,CNIC);
        this.weeklySalary = weeklySalary;
    }
    public String toString(){
        return "\nSalaried employee: " +super.toString() ;
    }
    public double earnings (){
        return weeklySalary;
    }

}

class HourlyEmployee extends Employee{
    double wage;
    double hours;

    void setWage(double wage){
        this.wage = wage;
    }
    void setHours(double hours){
        this.hours = hours;
    }

    double getWage(){
        return wage;
    }
    double getHours(){
        return hours;
    }

    HourlyEmployee(){
        wage=hours=0.00;
    }
    HourlyEmployee(String firstName, String lastName,String CNIC,double wage,double hours){
        super(firstName,lastName,CNIC);
        this.wage =wage;
        this.hours = hours;
    }

    public String toString(){
        return "\nHourly Employee: " + super.toString() ;
    }
    public double earnings (){
        if(hours<=40){
            return wage*hours;
        }
        else{
            return 40*wage + (hours-40)*wage*1.5;
        }
    }

}

class CommissionEmployee extends Employee{
    double grossSales;
    double commissionRate;

    public CommissionEmployee() {

    }

    void setGrossSales(double grossSales){
        this.grossSales=grossSales;
    }
    void setCommissionRate(double commissionRate){
        this.commissionRate=commissionRate;
    }
    double getGrossSales(){
        return grossSales;
    }
    double getCommissionRate(){
        return commissionRate;
    }

    CommissionEmployee(String firstName, String lastName, String CNIC){
        grossSales=commissionRate=0.00;
    }
    CommissionEmployee(String firstName,String lastName,String CNIC,double grossSales, double commissionRate){
        super(firstName,lastName, CNIC);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public String toString(){
        return "\nCommission Empolyee: " + super.toString();
    }

    public double earnings(){
        return grossSales * commissionRate;
    }

}

class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseSalary;

    void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    double getBaseSalary(){
        return baseSalary;
    }

    BasePlusCommissionEmployee(){
        super();
        baseSalary=0.00;
    }
    BasePlusCommissionEmployee(String firstName,String lastName,String CNIC,double grossSales, double commissionRate,double baseSalary){
        super(firstName,lastName, CNIC,grossSales,commissionRate);
        this.baseSalary=baseSalary;
    }

    public String toString(){
        return "\nBase Plus Commission employee: " + super.toString();
    }

    public double earnings (){
        return baseSalary + super.earnings();
    }
}

public class Main {
        public static void main(String[] args) {
            Employee thirdEmployee = new BasePlusCommissionEmployee("Fabeeha", "Fatima", "333-33-3333", 5000, 0.04, 300);

            Employee fourthEmployee = new HourlyEmployee("Hasnain", "Ali", "444-44-4444", 16.75, 40);
            // polymorphism: calling toString() and earning() on Employee’s reference


            Employee firstEmployee = new SalariedEmployee("Muhammad", "Ali", "11111-1111", 800.00);
            Employee secondEmployee = new CommissionEmployee("Tarwan", "Kumar",
                    "222-22-2222", 10000, 0.06);

            System.out.println(firstEmployee);
            System.out.println(firstEmployee.earnings());
            System.out.println(secondEmployee);
            System.out.println(secondEmployee.earnings());
            System.out.println(thirdEmployee);
            // performing downcasting to access & raise base salary
            BasePlusCommissionEmployee currentEmployee =
                    (BasePlusCommissionEmployee) thirdEmployee;
            double oldBaseSalary = currentEmployee.getBaseSalary();
            System.out.println("old base salary: " + oldBaseSalary);
            currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
            System.out.println("new base salary with 10% increase is:" + currentEmployee.getBaseSalary());
            System.out.println(thirdEmployee.earnings());
            System.out.println(fourthEmployee);
            System.out.println(fourthEmployee.earnings());
        } // end main
    } // end class











