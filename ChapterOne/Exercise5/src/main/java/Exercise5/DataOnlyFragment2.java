package Exercise5;

public class DataOnlyFragment2

{
    public static void main(String[] args)

    {
        class DataOnly

        {
            int i;
            double d;
            boolean b;
            void show()

            {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        DataOnly data = new DataOnly();
        data.i = 4;
        data.d = 2.5948984;
        data.b = false;
        data.show();
    }
}