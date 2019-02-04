class calci
{
    int x;
    int y;
    void get(int a,int b)
    {
        x=a;
        y=b;
    }
    void add()
    {
        int z;
        z=x+y;
        System.out.println("addition is:-"+z);
    }
    void sub()
    {
        int s;
        s=x-y;
         System.out.println("substraction is:-"+s);
    }
    void mul()
    {
        int m;
        m=x*y;
         System.out.println("multiplication is:-"+m);
    }
    void div()
    {
        int d;
        d=x/y;
         System.out.println("division is:-"+d);
    }
    public static void main(String args[])
    {
        calci obj=new calci();
        obj.get(34,2);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}