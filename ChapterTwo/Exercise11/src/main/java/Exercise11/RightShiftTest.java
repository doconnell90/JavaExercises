package Exercise11;


public class RightShiftTest {
    public static void main(String [] args) {
        int b = 10000000;
        System.out.println(Integer.toBinaryString(b));
        for(int i = 0; i < 23; i++) {
            b >>>= 1;
            System.out.println(Integer.toBinaryString(b));
        }
    }
}