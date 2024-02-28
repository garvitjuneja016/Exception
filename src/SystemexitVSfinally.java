class Beta3
{
    public void disp()
    {
        try
        {
            System.out.println("Display Mehtod");
            System.exit(0);
        }
//        system.exit will dominate over finally block.
        finally
        {
            System.out.println("finally");
        }
    }
}
public class SystemexitVSfinally {
    public static void main(String[] args) {
        Beta3 b=new Beta3();
        b.disp();
    }
}
