import java.util.Scanner;
class massIndex{
    static double weight;
    static double height;
    static double bmi;

    void setData()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the weight in pound: ");
        this.weight=s.nextDouble();
        System.out.println("Enter the height in inches: ");
       this. height=s.nextDouble();
    }
    double getData(double weight)
    {
        return weight;
    }
    double getHeight(double height)
    {
        return height;
    }
    public static double clacBmi(double weight, double height)
    {
        bmi=weight*703/(height*height);
        return bmi;
    }
    public static String findStatus(double bmi)
    {
        if(bmi<18.5)
        {
            return "Underweight";
        }
        else if (bmi>18.5 && bmi<=24.9 )
        {
            return "Normal";
        }
        else if (bmi>25.0 && bmi<=29.9)
        {
            return "Overweight";
        }
        else if(bmi>30.0)
        {
            return "Obese";
        }
        else
        return "Unknown";
    }

}


public class CalacBMI {

    public static void main(String[] args) {
        massIndex m = new massIndex();
        System.out.println("================================================");
        System.out.println("=================Calaculate BMI=================");
        m.setData();

        System.out.println("BMI = "+m.clacBmi(m.weight,m.height));
        System.out.println("Status = "+m.findStatus(m.bmi));

    }
}
