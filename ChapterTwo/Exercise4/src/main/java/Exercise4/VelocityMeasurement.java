package Exercise4;

class VelocityCalculator

{
    static float velocity (float d, float t)

    {
        if(t == 0) return 0f;              //if there is no time, there is no distance.
        else return d/t;
    }
}

public class VelocityMeasurement

{
    public static void main(String[] args)

    {
        float d = 350.0f;
        float t = 3.5f;
        System.out.println("Distance  = " + d);
        System.out.println("Time = " + t);
        float v = VelocityCalculator.velocity(d, t);
        System.out.println("Velocity = " + v);
    }
}