package Exercise12;

public class RightShiftTest

{
    public static void main(String [] args)

    {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 10;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 31; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}