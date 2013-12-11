package Exercise11;


public class RainbowColours

{
    public static void main(String[] args)

    {
        AllTheColoursOfTheRainbow allthecolours = new AllTheColoursOfTheRainbow();
        System.out.println("allthecolours.anIntegerRepresentingColours = " + allthecolours.anIntegerRepresentingColours);
        allthecolours.changeColour(5);
        allthecolours.changeTheHueOfTheColour(200);
        System.out.println("After colour change, atc.anIntegerRepresentingColours = " + allthecolours.anIntegerRepresentingColours);
        System.out.println("allthecolours.hue = " + allthecolours.hue);
    }
}

class AllTheColoursOfTheRainbow

{
    int anIntegerRepresentingColours = 0;
    int hue = 0;
    void changeTheHueOfTheColour(int newHue)

    {
        hue = newHue;
    }
    int changeColour(int newColour)

    {
        return anIntegerRepresentingColours = newColour;
    }
}