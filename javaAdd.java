import java.util.Scanner;
s
public class caladd
{

    public static void main(string args[])
    {
        float a,b,res;
        char choice,ch;
        Scanner scan = new Scanner(system.in);
    
        do {
            System.out.print("1. Add two numbers\n");
            System.out.print("2. Multiply two numbers\n");
            System.out.print("3. Exit\n");
            System.out.print("Enter your choice: ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1': 
                            System.out.print("Enter two numbers: ");
                            a = scan.nextFloat();
                            b = scan.nextFloat();
                            res = a+b;
                            System.out.print("Result = " + res);
                            break;
                
                case '2':
                            System.out.print("Enter two numbers: ");
                            a = scan.nextFloat();
                            b = scan.nextFloat();
                            res = a*b;
                            System.out.print("Result = " + res);
                            break;            
            
                case '3':
                            System.exit(0);
                            break;
                
                default :
                            System.out.print("Invalid choice!");
                            break;            
            }
            System.outprint("\n-------");
        } while(true);
    }
}