class Box
{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;

    }
    Box()
    {
        width=height=depth=0;
    }
    Box (Box obj)
    {
        width= obj.width;
        height= obj.height;
        depth= obj.depth;
    }
    void printData()
    {
        System.out.println("width= "+width+" height= "+height+" depth= "+depth);
    }

}


public class Main {
    public static void main(String[] args)
    {
        Box b1=new Box(1,2,3);
        System.out.print("Data of B1 is: ");
        b1.printData();
        Box b2=new Box();
        System.out.print("Data of B2 is: ");
        b2.printData();
        Box b3=new Box(b1);
        System.out.print("Data of B3 is: ");
        b3.printData();
       
       
    }
}
