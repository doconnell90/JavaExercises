package Exercise10;

public class Finalize {
    public static void main(String[] args)

    {
        Facebook session1 = new Facebook(true);
        Facebook session2 = new Facebook(true);
        session1.logOut();
        new Facebook(true);
        System.gc();
    }
}