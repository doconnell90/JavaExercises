package Exercise18;

public class TestInit2

{
    public static void main(String[] args)

    {
        TestInit[] testInits = new TestInit[5];
        for(int i = 0; i < testInits.length; i++)
            testInits[i] = new TestInit(Integer.toString(i));
    }
}
