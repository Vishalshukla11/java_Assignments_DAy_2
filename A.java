// Reverse of String
import java.util.Scanner;
class A 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
         //conver into array
        String []arr=str.split(" ");
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+ " ");
        // }
        //reverse the string 
        System.out.println("");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

   
        
        
        
    }

    
}
