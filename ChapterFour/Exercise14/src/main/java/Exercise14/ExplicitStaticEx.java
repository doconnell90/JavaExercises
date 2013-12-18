package Exercise14;

public class ExplicitStaticEx {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        StaticTest.how();
        System.out.println("StaticTest.s1: " + StaticTest.s1);
    }
    static StaticTest g1 = new StaticTest ();
    static StaticTest g2 = new StaticTest  ();
}