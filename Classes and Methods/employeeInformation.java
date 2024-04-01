class Employee {
    String name;
    int yearOfJoining;
    String address;

    void display() {

        System.out.println(name + "\t\t" + yearOfJoining + "\t" + address);
    }
}
public class Task1 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Robert";
        e1.yearOfJoining =1994;
        e1.address = "64C- WallsStreat";

        Employee e2 = new Employee();
        e2.name = "Sam    ";
        e2.yearOfJoining = 2000 ;
        e2.address = "68D- WallsStreat";

        Employee e3 = new Employee();
        e3.name="John";
        e3.yearOfJoining = 1999;
        e3.address = "26B- WallsStreat";
        System.out.println("Name \t\t Year of joining \t\t Address");
        e1.display();
        e2.display();
        e3.display();
    }

}
