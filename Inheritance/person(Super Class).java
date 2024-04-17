class Person {
    String firstName;
    String lastName;

    Person() {
        firstName = lastName = "";
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    void displayDetails() {
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);
    }
}

    class Student extends Person {

        String id;
        String course;
        String teacherName;

        Student(String firstName, String lastName,String id,String course,String teacherName) {
            super(firstName, lastName);
            this.id = id;
            this.course = course;
            this.teacherName = teacherName;
        }

        void displayStudent()
        {
            super.displayDetails();
            System.out.println("ID: "+id+" Course: "+course+" Teacher Name: "+teacherName);
        }
    }
    class Teacher extends Person{
        String subjectName;
        double salary;

        Teacher(String firstName,String lastName,String subjectName,double salary)
        {
            super(firstName,lastName);
            this.subjectName=subjectName;
            this.salary=salary;
        }
        void displayTeacher()
        {
            super.displayDetails();
            System.out.println("Subject Name: "+subjectName+" Salary: "+salary);
        }
    }

public class Main{
    public static void main (String args[]){
        Student s1=new Student("Saifullah","latki","023-22-0064","JAVA","Ghulam Mujtaba");
        Student s2=new Student("Muhammad","Abdullah","023-22-0123","JAVA","Sana Fatima");
        Teacher t1=new Teacher("Sana","Fatima","JAVA OOP",100000.0);
        Teacher t2=new Teacher("Abid","Ali","Calculus",200000.0);
        System.out.println("==============Students Details============");
        s1.displayStudent();
        s2.displayStudent();
        System.out.println("==============Teachers Details============");
        t1.displayTeacher();
        t2.displayTeacher();
    }


}
