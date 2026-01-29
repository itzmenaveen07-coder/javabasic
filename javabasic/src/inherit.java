interface M
{
    public default void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

interface N
{
    public default void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}
public class inherit implements M,N {

    @Override
    public void run() {
        M.super.run();
    }
}
