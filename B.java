//Palindrome String
import java.util.Scanner;
class B 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        int i=0, j=str.length()-1;
        boolean result=true;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println(" not palindrome ");
                System.exit(0);
            }
           i++;
           j--;
        }
        System.out.println("given string is palindrome ");
    }
}