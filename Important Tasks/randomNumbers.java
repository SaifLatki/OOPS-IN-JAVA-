import java.util.Random;

class Task1 {
    public static void main(String arg[]){
     Random rand= new Random();
        System.out.println("Random ten digit Phone number");
        int arrNum[]= new int[10];
         for(int i=0; i<10; i++) {
             if (i == 2)
                 arrNum[i] = rand.nextInt(8);
             else
                 arrNum[i] = rand.nextInt(9);
         }
             for(int j=0; j<10; j++){
                 if(j==2)
                     System.out.print(arrNum[j]+"-");
                 else if(j==5)
                     System.out.print(arrNum[j]+"-");
                 else
                     System.out.print(arrNum[j]);

             }


          }

    }
