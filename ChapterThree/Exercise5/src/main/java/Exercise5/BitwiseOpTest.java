package Exercise5;

public class BitwiseOpTest {


    static void binary (int b)

    {
         if(b == 0) System.out.println(0);
        else
         {
          int lz = Integer.numberOfLeadingZeros(b);
             b <<= lz;
             for (int i = 0 ; i < 32 - lz; i++)

             {
                 int n = (Integer.numberOfLeadingZeros(b) == 0) ? 1 : 0;
                 System.out.println(n);
                 b <<= 1;

             }




         }



    }





    public static void main(String[] args)

    {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        int k = 0x100;
        int m = 0;
        System.out.println("Using Integer.toBinaryString():");
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("k = " + Integer.toBinaryString(k));
        System.out.println("m = " + Integer.toBinaryString(m));
        System.out.println("i & j = " + (i & j) + " = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + (i | j) + " = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
        System.out.println("Using binaryPrint():");
        System.out.println("i = " + i + " = ");
        binary(i);
        System.out.println("j = " + j + " = ");
        binary(j);
        System.out.println("k = " + k + " = ");
        binary(k);
        System.out.println("m = " + m + " = ");
        binary(m);
        System.out.println("i & j = " + (i & j) + " = ");
        binary(i & j);
        System.out.println("i | j = " + (i | j) + " = ");
        binary(i | j);
        System.out.println("i ^ j = " + (i ^ j) + " = ");
        binary(i ^ j);
        System.out.println("~i = " + ~i + " = ");
        binary(~i);
        System.out.println("~j = " + ~j + " = ");
        binary(~j);
    }
}