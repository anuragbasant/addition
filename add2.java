import java.util.Scanner;
class add2
{
    public static void main(String args[])
    {
        int x;
        int y;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number");
        x=obj.nextInt();
        System.out.println("Enter the second number");
        y=obj.nextInt();
        System.out.println("addition is:-"+ x+y);
        
    }
}