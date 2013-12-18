package Exercise14;

class StaticTest


{

    static String s1 = "a";
    static String s2, s3;
    static

        {
            s2 = "b";
            s3 = "c";
            System.out.println("s2 & s3 initialized");
        }

    static void how()

        {
            System.out.println(s1 + " or " + s2 + " or " + s3);
        }
    StaticTest() { System.out.println("a b or c");


    }
}