import java.util.Scanner;
 class TaskNo4 {
    public static void main (String args [])
    {
        Scanner input= new Scanner(System.in);
       String arr[]= new String[5];

           for (int a=0; a<5; a++)
           {
               System.out.print("Ente the word "+(a+1)+ ": ");
               String sh= input.next();
    arr[a]=sh;
           }
        System.out.println("=========================");
        System.out.println("Word \t \t Palindrome ");
        System.out.println("=========================");
       for(int j=0; j< arr.length; j++)
       {
           boolean result=true;
           int m= arr[j].length()-1;
           for (int k=0; k<m; k++,m-- ){
               if(arr[j].charAt(k)!= arr[j].charAt(m))
                   result=false;
           }
           if(result){
               System.out.println(arr[j]+ " \t\t "+ "Yes");
           }
           else{
               System.out.println(arr[j]+" \t\t "+ "No");
           }


       }

    }
}
