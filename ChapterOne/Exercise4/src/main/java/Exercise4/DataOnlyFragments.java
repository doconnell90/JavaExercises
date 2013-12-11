package Exercise4;

public class DataOnlyFragments

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
        data.d = 1.22223;
        data.b = false;
        data.show();
    }
}