import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        System.out.println("Enter your Full Name= ");
        Scanner str=new Scanner(System.in);
        String name=str.nextLine();

        for (int i=0; i<name.length(); i++){
            if (name.charAt(i)==' ')
                System.out.println(name.charAt(i+1));
        }

    }
}
