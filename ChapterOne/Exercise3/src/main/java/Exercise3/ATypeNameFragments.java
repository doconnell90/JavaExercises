package Exercise3;

public class ATypeNameFragments

{
    public static void main(String[] args)

    {
        class ATypeName

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

        ATypeName a = new ATypeName();
        a.i = 4;
        a.d = 1.22223;
        a.b = false;
        a.show();
    }
}