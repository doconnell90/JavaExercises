package Exercise5;

public class DogTalk
{
    public static void main( String[] args )
    {
        Dog dog = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        dog.bark();
        dog.bark(c);
        dog.bark(b);
        dog.bark(s);
        dog.bark(1);
        dog.bark(1l);
        dog.bark(1.0f);
        dog.bark(2.0);

    }
}
