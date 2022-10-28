class MyThread implements Runnable
{
    Thread t;
    public MyThread(String title)
    {
        t = new Thread(this, title);
        t.start();
    }
    @Override
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            System.out.println((i+1) + " ThreadName : "+Thread.currentThread().getName());
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e)
            {

            }
        }
    }
}
class multithread2
{
    public static void main(String[] args)
    {
        System.out.println("ThreadName : "+Thread.currentThread().getName());
        MyThread mt = new MyThread("Multithreading Program");
    }
}