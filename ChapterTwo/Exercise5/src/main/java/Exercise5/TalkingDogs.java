package Exercise5;


public class TalkingDogs {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();
        Dog fucker = new Dog();
        fucker.setName("Fucker");
        fucker.setSays("fuck off");
        fucker.showName();
        fucker.speak();


        //assign fuckers reference to spots object.

        System.out.println("Comparing dogs: ");
        System.out.println("spot == fucker: " + (spot == fucker));
        System.out.println("spot.equals(fucker): " + spot.equals(fucker));
        System.out.println("fucker.equals(spot): " + fucker.equals(spot));
        System.out.println("Now assign: spot = fucker");

        spot = fucker;

        System.out.println("Compare again: ");
        System.out.println("spot == fucker: " + (spot == fucker));
        System.out.println("spot.equals(fucker): " + spot.equals(fucker));
        System.out.println("fucker.equals(spot): " + fucker.equals(spot));

        System.out.println("Spot: ");
        spot.showName();
        spot.speak();

        System.out.println("fucker: ");
        fucker.showName();
        fucker.speak();


    }
}

class Dog {
    String name;
    String says;
    void setName(String n)

    {
        name = n;
    }
    void setSays(String s)

    {
        says = s;
    }
    void showName()

    {
        System.out.println(name);
    }
    void speak()

    {
        System.out.println(says);
    }
}
