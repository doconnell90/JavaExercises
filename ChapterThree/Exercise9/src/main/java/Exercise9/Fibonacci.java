package Exercise9;

public class Fibonacci

{
    int fibNo(int n)
    {
        if(n < 2) return 1;
        return (fibNo(n - 2) + fibNo(n - 1));
    }
    public static void main(String[] args)

    {
        Fibonacci fibonacci = new Fibonacci();
        int chosen = Integer.parseInt(args[0]);
        System.out.println("You have chosen " + chosen + " Fibonacci number(s): ");
        for(int i = 0; i < chosen; i++)
            System.out.println(fibonacci.fibNo(i));
    }
}