import PackgOne.ClassFirst;
import PackgOne.ClassSecond;
import PackgTwo.ClassPack2;
import PackgTwo.ClassPack2_2;
import PackgThree.ClassPack3_1;
import PackgThree.ClassPack3_2;
public class PackagePractice {
    public static void main(String args[]){

        System.out.println("=====Class No 1=====");
        ClassFirst c1=new ClassFirst();
        System.out.println("Adddion is= "+(c1.addition(3,5)));

        System.out.println("=====Class No 2=====");
        ClassSecond c2=new ClassSecond();
        System.out.println("Subtraction is= "+(c2.subtract(30,4)));

        System.out.println("=====Class No 3=====");
        ClassPack2 c3=new ClassPack2();
        System.out.println("Multipliction is= "+(c3.multiply(12,3)));

        System.out.println("=====Class No 4=====");
        ClassPack2_2 c4=new ClassPack2_2();
        System.out.println("Didvsion of intergers is= "+(c4.divide(66,3)));

        System.out.println("======Class No 5=====");
        ClassPack3_1 c5=new ClassPack3_1();
        System.out.println("Reminder is= "+(c5.modules(54,2)));

        System.out.println("=====Class No 6=====");
        ClassPack3_2 c6=new ClassPack3_2();
        System.out.println("Division of Double Numbers= "+(c6.division(99.9,33.3)));

    }
}
