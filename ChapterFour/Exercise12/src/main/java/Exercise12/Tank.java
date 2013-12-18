package Exercise12;

public class Tank

{

    int howMuchLeft = 0;

    Tank()
    {
        this(0);
    }

    Tank(int fullness)
    {
        howMuchLeft = fullness;
    }
    void sayHowMuchFuel() {
        if(howMuchLeft == 0) System.out.println("Tank is empty");
        else System.out.println("Tank filling status = " + howMuchLeft);
    }
    void empty() {
        howMuchLeft = 0;
    }
    protected void finalize()

    {
        if(howMuchLeft != 0)
            System.out.println("Error: Tank not empty");
    }


}
