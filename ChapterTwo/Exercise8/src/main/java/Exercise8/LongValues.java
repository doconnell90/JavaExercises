package Exercise8;


public class LongValues

{
    public static void main(String[] args) {
        long n1 = 077777; // octal
        long n2 = 0xffff; // hexadecimal

        System.out.println("long n2 in oct = " + Long.toBinaryString(n1));
        System.out.println("long n1 in hex = " + Long.toBinaryString(n2));

    }
}