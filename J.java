//Print Second Last String in String Array
import java.util.Scanner;
class J 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  string");
        String str= sc.nextLine();
        //conver intp array
        String [] arr=str.split(" ");

        //check in array atleast more than 2 characters are there or not 
        if(arr.length>2)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(i==arr.length-2)
                {
                    System.out.println("second last string is => "+ arr[i]);

                }
            }

        }
        else
        {
            System.out.println("in array have only to characters");
        }

    }
}
