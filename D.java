// Print Word with Even Length in String
import java.util.Scanner;
class D 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int count=0;

        String []arr = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i].length()%2==0)
                {
                    System.out.println(arr[i]);
                    count++;
                }
            
        }
        System.out.println("total even words present in this paragraph = " + count);
    }
}