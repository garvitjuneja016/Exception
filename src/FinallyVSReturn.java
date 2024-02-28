class  Demo
{
    public int disp()
    {
        try
        {
            System.out.println("display");
            return 10;
//       System.out.println("Welcome you all");  ---->>lines below the return keyword are unreachable,
//       thats why compiler gives the error whenever we try to write below the return keyword.

        }
        finally
        {
            System.out.println("Last line");
        }

    }
}

public class FinallyVSReturn {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.disp());
    }
}
