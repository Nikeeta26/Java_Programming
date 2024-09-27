class demo
{
synchronized void show(int n)
{
        for(int i=1;i<=5;i++)
        {
             System.out.println(n*i);
        try
        {
               Thread.sleep(400);
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
}
}
} 

public class sample
{
public static void main(String args[])
{
        demo d1 = new demo();
 Thread t1=new Thread()
{
    public void run()
    {
    d1.show(5);
    }
};

Thread t2=new Thread()
{
    public void run()
    {
    d1.show(100);
    }
};
t1.start();
t2.start();
}
}