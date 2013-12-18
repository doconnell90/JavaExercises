package Exercise5;


public class AccessControlTest {
    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();
        accessTest.showa();
        accessTest.showb();
        accessTest.showc();
        accessTest.a = 10;
        accessTest.b = 20;
        accessTest.c = 30;
        accessTest.showa();
        accessTest.showb();
        accessTest.showc();
        //accessTest.showd();

    }
}