import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two number: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = num1 / num2;
      //  System.out.println(result);
        int r2=(int)result;
        //System.out.println(r2);
        double comp=result-r2;
      //  System.out.println(comp);
        if (comp >= 0.5)
        {
            System.out.println((r2+1));

        }
        else {
            System.out.println(r2);
        }
    }
}
