package Exercise4;

public class FindPrimeNumbers

{
    public static void main(String[] args) {
        for(int i = 1; i < 333; i++ ) {
            int base = 0;
            for(int p = 1; p < (i + 2)/2; p++ ) {
                if((i % p) == 0) base++;
            }
            if(base < 2) System.out.println(i + " is prime");
        }
    }
}