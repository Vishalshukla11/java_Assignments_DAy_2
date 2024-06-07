// Check Panagram String 
import java.util.Scanner;
class G 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        //conver into array
        String [] arr=str.split(" ");
        //converinto lower/uppercase
        str.toLowerCase();
        boolean ispanagram=true;

        //check if any alphabet is missing

        for(int i='a';i<='z';i++)
        {
            if(str.indexOf((char)i)==-1)
            {
                ispanagram=false;
                break;
            }
        }
        if(ispanagram)
        {
            System.out.println("given string is panagram");

        }
        else
        {
            System.out.println("given string is not panagram ");
        }

        

        }
    }
