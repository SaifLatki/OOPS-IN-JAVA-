abstract class Marks {
    abstract  void getPercentage();

}
 class StudentA extends Marks{
    double subj1;
    double subj2;
    double subj3;

    StudentA(double subj1,double subj2,double subj3){
        this.subj1=subj1;
        this.subj2=subj2;
        this.subj3=subj3;
    }


     @Override
     void getPercentage() {
         double result;
         result=((subj1+subj2+subj3)/300)*100;
         System.out.println("Percentage= "+result);
     }
 }
 class StudentB extends Marks{
    double subj1;
    double subj2;
    double subj3;
    double subj4;

    StudentB(double subj1,double subj2,double subj3,double subj4){
        this.subj1=subj1;
        this.subj2=subj2;
        this.subj3=subj3;
        this.subj4=subj4;
    }


     @Override
     void getPercentage() {
         double result;
         result=((subj1+subj2+subj3+subj4)/400)*100;
         System.out.println("Percentage= "+result);
     }
 }
class MainClass{
    public static void main(String args[]) {
        Marks s1 = new StudentA(78.0, 88.0, 87.0);
        Marks s2 =new StudentB(89.0,87.0,94.0,88.0);
        System.out.println("====Student A====");
        s1.getPercentage();
        System.out.println("====Student B====");
        s2.getPercentage();
    }
    }
