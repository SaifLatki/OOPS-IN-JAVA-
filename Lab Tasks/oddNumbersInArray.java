public class Task6 {
    public static void main(String[] args) {
        int range=0;
        int len=15;

        int arr[]=new int[len];
        for(int i = 0; i < 30; i++){
            if(i%2!=0){
             //   System.out.println(i);
                arr[range]=i;
                range++;

            }
        }
      //  System.out.println(range);
        for(int j=0; j < range; j++)
        {
            System.out.print(arr[j]+" , ");
        }
    }
}
