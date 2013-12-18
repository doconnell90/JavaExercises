package Exercise11;

public class Finalize {
    public static void main(String[] args)

    {
        Facebook session1 = new Facebook(true);
        Facebook session2 = new Facebook(true);
        new Facebook(true);
        session1.logOut();
        System.out.println("Attempt 1 ");
        System.runFinalization();
        System.out.println("Attempt 2 ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Attempt 3 ");
        System.gc();



    }
}