package Exercise12;

public class Test {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        tank2.empty();
        tank1.empty();
        new Tank(6);
        System.out.println("Check tanks:");
        System.out.println("tank1: ");
        tank1.sayHowMuchFuel();
        System.out.println("tank2: ");
        tank2.sayHowMuchFuel();
        System.out.println("tank3: ");
        tank3.sayHowMuchFuel();
        System.out.println("Attempting to clean tanks");
        System.runFinalizersOnExit(true);

    }
}