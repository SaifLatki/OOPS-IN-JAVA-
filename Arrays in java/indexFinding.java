import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[] = new int[7];
	    System.out.println("Enter the Values of array: ");
		for (int i=0; i<7; i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int j=0; j<7; j++)
		{
		    System.out.println(arr[j]);
		}
		System.out.println("Enter the index number to find the value: ");
		int x=sc.nextInt();
		int count=1;
		boolean result=false;
		for (int k=0; k<7; k++)
		{
		    if(arr[k]==x)
		    {
		        result=true;
		        count++;
		       
		    }
		    else 
		    {
		        result=false;
		    }
		}
	
		if(result==true)
		{
		    System.out.println(x+" Number in index no#: "+count);
		}
		else {
		    System.out.println("Number is not Present ");
		}
		
	}
}

