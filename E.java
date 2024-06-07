//Print String Present at Even Locations in Array
import java.util.Scanner;
class E 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String");
        String str= sc.nextLine();
        //conver into array
        String [] arr=str.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
