import java.util.Scanner;
 class Methods {

    void methode1(int x, char a)
    {
        System.out.println("Value of Int type= " +x);
        System.out.println("Character is= "+ a);
    }
    void methode2(char a, int x)
    {
        System.out.println("Value of int type= " +x);
        System.out.println("Character is= "+ a);
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods obj = new Methods();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter any Character: ");
        char a = sc.next().charAt(0);
        obj.methode1(x,a);
        obj.methode2(a,x);
    }
}
