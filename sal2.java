import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int b,sal;
        System.out.println("Enter your salary");
        sal=obj.nextInt();
        if(sal>=10000)
        {
            b=(sal*10)/100;
            sal=sal+b;
        }
         else
         {
            b=(sal*5)/100;
            sal=sal+b;
         }
         System.out.println("your salary is " +sal);
    }
}