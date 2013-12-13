package Exercise8;

public class Switch {
    public static void main(String[] args) {
        for(int i = 0; i < 8; i++)

        {
            switch(i) {
                case 0: System.out.println("this"); //break;
                case 1: System.out.println("is"); //break;
                case 2: System.out.println("test"); break;
                case 3: System.out.println("of"); //break;
                case 4: System.out.println("the"); break;
                case 5: System.out.println("break"); //break;
                case 6: System.out.println("function"); //break;
                default: System.out.println("default");
            }
        }
    }
}