class addition
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
        System.out.println("The addition is:-"+z);
    }
    public static void main(String args[])
    {
      addition obj=new addition();
      obj.get(56,7);
      obj.add();
    }
}