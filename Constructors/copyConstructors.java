class Car
{
    String name;
    int model;
    String color;
    double price;

    Car()
    {
        name="Civic";
    }
    Car(int model, String color, double price)
    {
        this();
        this.model=model;
        this.color=color;
        this.price=price;
    }
    Car (Car c)
    {
    this.name=c.name;
    this.model= c.model;
    this.color=c.color;
    this.price=c.price;
    }
    void display()
    {
    System.out.println("Name= "+name+" Model= "+model+" Color= "+color+" Price= "+price);
    }
}


public class construct {
    public static void main(String args[])
    {
    Car c= new Car(2022,"Black",2500000.0);
    Car d= new Car (c);
    c.display();
    d.display();
    }
}
