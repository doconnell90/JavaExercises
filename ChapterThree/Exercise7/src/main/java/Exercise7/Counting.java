package Exercise7;

public class Counting {
    static void Test1(int n) {
        for(int i = 0; i < n; i++)
            System.out.println(i + 1);

    }
    static void Test2(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1);
            if(i == 99)
                break;
        }
    }
    static void Test3(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1);
            if(i == 99)
                return;
        }
    }

    public static void main(String[] args) {
        Test1(100);
        Test2(100);
        Test3(100);
    }
}