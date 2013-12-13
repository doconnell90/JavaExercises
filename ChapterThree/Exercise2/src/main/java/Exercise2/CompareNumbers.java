package Exercise2;

import java.util.Random;

public class CompareNumbers {
    public static void main(String[] args) {
        Random num1 = new Random();
        Random num2 = new Random();
        for(int i = 0; i < 25; i++) {
            int a = num1.nextInt();
            int b = num2.nextInt();
            if(a < b) System.out.println(a + " < " + b);
            else if(a > b) System.out.println(a + " > " + b);
            else System.out.println(a + " = " + b);
        }
    }
}