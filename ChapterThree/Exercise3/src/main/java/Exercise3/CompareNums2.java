package Exercise3;


import java.util.Random;

public class CompareNums2

{
    public static void main(String[] args)

    {
        Random num1 = new Random();
        Random num2 = new Random();
        for(int i = 0; i < 25; i++) {
            int a = num1.nextInt();
            int b = num2.nextInt();
            if(a < b) System.out.println(a + " < " + b);
            else if(a > b) System.out.println(a + " > " + b);
            else System.out.println(a + " = " + b);
        }
        Random num3 = new Random();
        Random num4 = new Random();
        while(true) {
            int a = num3.nextInt(15);
            int b = num4.nextInt(15);
            if(a < b)System.out.println(a + " < " + b);
            else if(a > b) System.out.println(a + " > " + b);
            else System.out.println(a + " = " + b);
        }
    }
}
